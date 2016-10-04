/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Portions copyright 2014-2016 ForgeRock AS.
 */

import _ from "lodash";
import "crypto-js-sha256";
import CryptoJS from "crypto-js";

import { sessionAddInfo } from "store/actions/creators";
import AbstractDelegate from "org/forgerock/commons/ui/common/main/AbstractDelegate";
import Constants from "org/forgerock/commons/ui/common/util/Constants";
import store from "store/index";

const obj = new AbstractDelegate(`${Constants.host}/${Constants.context}/json/sessions`);
const getHexEncodedSHA256Hash = (input) => {
    const hash = CryptoJS.SHA256(input);

    return CryptoJS.enc.Hex.stringify(hash);
};
const getSessionInfo = (token, options) => {
    return obj.serviceCall(_.merge({
        url: `/${getHexEncodedSHA256Hash(token)}`,
        headers: {
            "Accept-API-Version": "protocol=1.0,resource=2.0",
            "user-session-token": token
        }
    }, options));
};

export const getTimeLeft = (token) => {
    return getSessionInfo(token, { suppressSpinner: true }).then((sessionInfo) => sessionInfo.maxtime);
};

export const updateSessionInfo = (token, options) => {
    return getSessionInfo(token, options).then((response) => {
        store.dispatch(sessionAddInfo({
            maxidletime: response.maxidletime,
            realm: response.realm
        }));
        return response;
    });
};

export const isSessionValid = (token) => getSessionInfo(token).then((response) => _.has(response, "uid"));

export const logout = (token) => {
    return obj.serviceCall({
        url: `/${getHexEncodedSHA256Hash(token)}?_action=logout`,
        type: "POST",
        data: {},
        headers: {
            "Accept-API-Version": "protocol=1.0,resource=2.0",
            "user-session-token": token
        },
        errorsHandlers: { "Bad Request": { status: 400 } }
    });
};