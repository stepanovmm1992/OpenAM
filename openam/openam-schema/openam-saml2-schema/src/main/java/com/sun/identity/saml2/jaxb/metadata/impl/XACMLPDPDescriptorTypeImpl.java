//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.metadata.impl;

public class XACMLPDPDescriptorTypeImpl
    extends com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl
    implements com.sun.identity.saml2.jaxb.metadata.XACMLPDPDescriptorType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _XACMLAuthzService;
    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.metadata.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadata.XACMLPDPDescriptorType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getXACMLAuthzService() {
        if (_XACMLAuthzService == null) {
            _XACMLAuthzService = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _XACMLAuthzService;
    }

    public java.util.List getXACMLAuthzService() {
        return _getXACMLAuthzService();
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_XACMLAuthzService == null)? 0 :_XACMLAuthzService.size());
        super.serializeBody(context);
        while (idx1 != len1) {
            if (_XACMLAuthzService.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _XACMLAuthzService.get(idx1 ++)), "XACMLAuthzService");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "XACMLAuthzService");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _XACMLAuthzService.get(idx_0 ++)), "XACMLAuthzService");
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _XACMLAuthzService.get(idx_1 ++)), "XACMLAuthzService");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _XACMLAuthzService.get(idx1 ++)), "XACMLAuthzService");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_XACMLAuthzService == null)? 0 :_XACMLAuthzService.size());
        super.serializeAttributes(context);
        while (idx1 != len1) {
            if (_XACMLAuthzService.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _XACMLAuthzService.get(idx1 ++)), "XACMLAuthzService");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_XACMLAuthzService == null)? 0 :_XACMLAuthzService.size());
        super.serializeURIs(context);
        while (idx1 != len1) {
            if (_XACMLAuthzService.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _XACMLAuthzService.get(idx1 ++)), "XACMLAuthzService");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.metadata.XACMLPDPDescriptorType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000pp"
+"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u000fsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002"
+"\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001eco"
+"m.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAt"
+"tributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u000fppsr\u0000 com.sun"
+".msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar."
+"UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0013psr\u0000 com.sun.msv.gr"
+"ammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0015xq\u0000"
+"~\u0000\u0003q\u0000~\u0000\u0013psr\u00002com.sun.msv.grammar.Expression$AnyStringExpress"
+"ion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0012\u0001q\u0000~\u0000\u001fsr\u0000 com.sun.msv.grammar.AnyN"
+"ameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000 q\u0000~\u0000%sr\u0000#com.sun.msv.grammar.SimpleNameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceU"
+"RIq\u0000~\u0000\'xq\u0000~\u0000\"t\u00003com.sun.identity.saml2.jaxb.xmlsig.Signature"
+"Elementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0014q"
+"\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u0000\u001f"
+"q\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00000com.sun.identity.saml2.jaxb.xmlsig.Signat"
+"ureTypeq\u0000~\u0000*sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013psr\u0000\u001bcom.sun.msv.grammar.Data"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exce"
+"ptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"co"
+"m.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.d"
+"atatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.data"
+"type.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd"
+".XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\'L\u0000\btypeNameq\u0000~"
+"\u0000\'L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProces"
+"sor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+",com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr"
+"\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0013psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlo"
+"calNameq\u0000~\u0000\'L\u0000\fnamespaceURIq\u0000~\u0000\'xpq\u0000~\u0000@q\u0000~\u0000?sq\u0000~\u0000&t\u0000\u0004typet\u0000)"
+"http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000%sq\u0000~\u0000&t\u0000\tSigna"
+"turet\u0000\"http://www.w3.org/2000/09/xmldsig#q\u0000~\u0000%sq\u0000~\u0000\u000fppsq\u0000~\u0000\u000f"
+"q\u0000~\u0000\u0013psq\u0000~\u0000\u0014q\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u0000\u001fq\u0000~\u0000"
+"#q\u0000~\u0000%sq\u0000~\u0000&t\u00006com.sun.identity.saml2.jaxb.metadata.Extensio"
+"nsElementq\u0000~\u0000*sq\u0000~\u0000\u0014q\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000"
+"~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00003com.sun.identity.sam"
+"l2.jaxb.metadata.ExtensionsTypeq\u0000~\u0000*sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u0000"
+"8q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\nExtensionst\u0000$urn:oasis:names:tc:SAML:2.0"
+":metadataq\u0000~\u0000%sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014q\u0000~\u0000\u0013p\u0000s"
+"q\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00009com.s"
+"un.identity.saml2.jaxb.metadata.KeyDescriptorElementq\u0000~\u0000*sq\u0000"
+"~\u0000\u0014q\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq"
+"\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00006com.sun.identity.saml2.jaxb.metadata."
+"KeyDescriptorTypeq\u0000~\u0000*sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000"
+"~\u0000&t\u0000\rKeyDescriptorq\u0000~\u0000bq\u0000~\u0000%sq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014q\u0000~\u0000\u0013"
+"p\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00008co"
+"m.sun.identity.saml2.jaxb.metadata.OrganizationElementq\u0000~\u0000*s"
+"q\u0000~\u0000\u0014q\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013"
+"pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00005com.sun.identity.saml2.jaxb.metadat"
+"a.OrganizationTypeq\u0000~\u0000*sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq"
+"\u0000~\u0000&t\u0000\fOrganizationq\u0000~\u0000bq\u0000~\u0000%sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u000fq\u0000~\u0000\u0013"
+"psq\u0000~\u0000\u0014q\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000"
+"%sq\u0000~\u0000&t\u00009com.sun.identity.saml2.jaxb.metadata.ContactPerson"
+"Elementq\u0000~\u0000*sq\u0000~\u0000\u0014q\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000"
+"\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00000com.sun.identity.saml2"
+".jaxb.metadata.ContactTypeq\u0000~\u0000*sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u00008q\u0000~\u0000"
+"Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\rContactPersonq\u0000~\u0000bq\u0000~\u0000%sq\u0000~\u0000\u0019ppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u0014"
+"pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000=c"
+"om.sun.identity.saml2.jaxb.metadata.XACMLAuthzServiceElement"
+"q\u0000~\u0000*sq\u0000~\u0000\u0014pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0019q\u0000~\u0000\u0013psq\u0000~\u0000\u001cq\u0000~"
+"\u0000\u0013pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00001com.sun.identity.saml2.jaxb.metad"
+"ata.EndpointTypeq\u0000~\u0000*sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~"
+"\u0000&t\u0000\u0011XACMLAuthzServiceq\u0000~\u0000bsq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013psq\u0000~\u00005ppsr\u0000\u001fc"
+"om.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.dat"
+"atype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd."
+"TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000:q\u0000~\u0000?t\u0000\u0002IDq\u0000~\u0000C\u0000q\u0000~\u0000Esq\u0000~\u0000Fq"
+"\u0000~\u0000\u00bdq\u0000~\u0000?sq\u0000~\u0000&t\u0000\u0002IDt\u0000\u0000q\u0000~\u0000%sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013psq\u0000~\u00005ppsr\u0000%"
+"com.sun.msv.datatype.xsd.DurationType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000:q\u0000~\u0000?t"
+"\u0000\bdurationq\u0000~\u0000Cq\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000\u00c7q\u0000~\u0000?sq\u0000~\u0000&t\u0000\rcacheDurationq\u0000"
+"~\u0000\u00c1q\u0000~\u0000%sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013psq\u0000~\u00005q\u0000~\u0000\u0013psr\u0000#com.sun.msv.data"
+"type.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000:q\u0000~\u0000?t\u0000\u0006anyURIq\u0000~\u0000Cq\u0000~\u0000E"
+"sq\u0000~\u0000Fq\u0000~\u0000\u00d0q\u0000~\u0000?sq\u0000~\u0000&t\u0000\berrorURLq\u0000~\u0000\u00c1q\u0000~\u0000%sq\u0000~\u0000\u001cppsq\u0000~\u00005pps"
+"r\u0000!com.sun.msv.datatype.xsd.ListType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bitemTypet\u0000"
+")Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;xq\u0000~\u0000;q\u0000~\u0000bt\u0000\u000eanyU"
+"RIListTypeq\u0000~\u0000Cq\u0000~\u0000\u00cfq\u0000~\u0000Epsq\u0000~\u0000&t\u0000\u001aprotocolSupportEnumeratio"
+"nq\u0000~\u0000\u00c1sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001cq\u0000~\u0000\u0013psq\u0000~\u00005ppsr\u0000%com.sun.msv.datatype.x"
+"sd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateT"
+"imeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000:q\u0000~\u0000?t\u0000\bdateTimeq\u0000~\u0000Cq\u0000~\u0000Esq\u0000~\u0000F"
+"q\u0000~\u0000\u00e2q\u0000~\u0000?sq\u0000~\u0000&t\u0000\nvalidUntilq\u0000~\u0000\u00c1q\u0000~\u0000%sr\u0000\"com.sun.msv.gramm"
+"ar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gramm"
+"ar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expre"
+"ssionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006pa"
+"rentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000@\u0001pq\u0000~\u0000pq\u0000~\u0000"
+"hq\u0000~\u0000Zq\u0000~\u0000Rq\u0000~\u0000/q\u0000~\u0000\u001bq\u0000~\u0000\u00cbq\u0000~\u0000\u00a1q\u0000~\u0000\u008dq\u0000~\u0000dq\u0000~\u0000\u00acq\u0000~\u0000\u00a4q\u0000~\u0000\u0098q\u0000~\u0000"
+"\u0090q\u0000~\u0000\u0083q\u0000~\u0000{q\u0000~\u0000oq\u0000~\u0000gq\u0000~\u0000Yq\u0000~\u0000Qq\u0000~\u0000.q\u0000~\u0000\u0018q\u0000~\u0000\u0006q\u0000~\u0000\u00aaq\u0000~\u0000\u0096q\u0000~\u0000"
+"\u0081q\u0000~\u0000mq\u0000~\u0000Wq\u0000~\u0000,q\u0000~\u0000\u0005q\u0000~\u0000xq\u0000~\u0000Nq\u0000~\u0000\u0010q\u0000~\u0000\u008cq\u0000~\u0000cq\u0000~\u0000\u00a2q\u0000~\u0000\u008eq\u0000~\u0000"
+"yq\u0000~\u0000eq\u0000~\u0000Oq\u0000~\u0000\u0011q\u0000~\u0000\tq\u0000~\u0000\u00c2q\u0000~\u0000\u00dcq\u0000~\u0000\u0007q\u0000~\u0000\nq\u0000~\u0000\u00b1q\u0000~\u0000\u009dq\u0000~\u0000\u0088q\u0000~\u0000"
+"tq\u0000~\u0000^q\u0000~\u00003q\u0000~\u0000\u00b5q\u0000~\u0000\u000bq\u0000~\u0000\u000eq\u0000~\u0000\fq\u0000~\u0000\rq\u0000~\u0000\bq\u0000~\u0000\u00adq\u0000~\u0000\u00a5q\u0000~\u0000\u0099q\u0000~\u0000"
+"\u0091q\u0000~\u0000\u0084q\u0000~\u0000|x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "-----");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        attIdx = context.getAttribute("", "Binding");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  1 :
                        if (("XACMLAuthzService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getXACMLAuthzService().add(((com.sun.identity.saml2.jaxb.metadata.impl.XACMLAuthzServiceElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.XACMLAuthzServiceElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("XACMLAuthzService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("XACMLAuthzService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getXACMLAuthzService().add(((com.sun.identity.saml2.jaxb.metadata.impl.XACMLAuthzServiceElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.XACMLAuthzServiceElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("XACMLAuthzService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        attIdx = context.getAttribute("", "Binding");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
                        if (("XACMLAuthzService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 2;
                            return ;
                        }
                        break;
                    case  2 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        if (("Binding" == ___local)&&("" == ___uri)) {
                            _getXACMLAuthzService().add(((com.sun.identity.saml2.jaxb.metadata.impl.EndpointTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.saml2.jaxb.metadata.impl.EndpointTypeImpl.class), 4, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  2 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("ID" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("cacheDuration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("errorURL" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("protocolSupportEnumeration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        attIdx = context.getAttribute("", "Binding");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  2 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            attIdx = context.getAttribute("", "Binding");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  2 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "ID");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "cacheDuration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "errorURL");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "protocolSupportEnumeration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
