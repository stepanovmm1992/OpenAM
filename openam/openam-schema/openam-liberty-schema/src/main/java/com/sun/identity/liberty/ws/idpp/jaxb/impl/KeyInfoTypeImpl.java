//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.idpp.jaxb.impl;

public class KeyInfoTypeImpl
    extends com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl
    implements com.sun.identity.liberty.ws.idpp.jaxb.KeyInfoType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected java.lang.String _ACC;
    protected java.util.Calendar _ModificationTime;
    protected java.lang.String _Modifier;
    protected java.util.Calendar _ACCTime;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.idpp.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.idpp.jaxb.KeyInfoType.class);
    }

    public java.lang.String getACC() {
        return _ACC;
    }

    public void setACC(java.lang.String value) {
        _ACC = value;
    }

    public java.util.Calendar getModificationTime() {
        return _ModificationTime;
    }

    public void setModificationTime(java.util.Calendar value) {
        _ModificationTime = value;
    }

    public java.lang.String getModifier() {
        return _Modifier;
    }

    public void setModifier(java.lang.String value) {
        _Modifier = value;
    }

    public java.util.Calendar getACCTime() {
        return _ACCTime;
    }

    public void setACCTime(java.util.Calendar value) {
        _ACCTime = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_ACC!= null) {
            context.startAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
            try {
                context.text(((java.lang.String) _ACC), "ACC");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_ACCTime!= null) {
            context.startAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
            try {
                context.text(com.sun.msv.datatype.xsd.DateTimeType.theInstance.serializeJavaObject(((java.util.Calendar) _ACCTime), null), "ACCTime");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_ModificationTime!= null) {
            context.startAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
            try {
                context.text(com.sun.msv.datatype.xsd.DateTimeType.theInstance.serializeJavaObject(((java.util.Calendar) _ModificationTime), null), "ModificationTime");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Modifier!= null) {
            context.startAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
            try {
                context.text(((java.lang.String) _Modifier), "Modifier");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        super.serializeAttributes(context);
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_ACC!= null) {
            context.getNamespaceContext().declareNamespace("urn:liberty:id-sis-pp:2003-08", null, true);
        }
        if (_ACCTime!= null) {
            context.getNamespaceContext().declareNamespace("urn:liberty:id-sis-pp:2003-08", null, true);
        }
        if (_ModificationTime!= null) {
            context.getNamespaceContext().declareNamespace("urn:liberty:id-sis-pp:2003-08", null, true);
        }
        if (_Modifier!= null) {
            context.getNamespaceContext().declareNamespace("urn:liberty:id-sis-pp:2003-08", null, true);
        }
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.idpp.jaxb.KeyInfoType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001ccom."
+"sun.msv.grammar.MixedExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.U"
+"naryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003ppsr\u0000 com.sun.msv.grammar"
+".OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u000bppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~"
+"\u0000\u000fppsq\u0000~\u0000\u000fppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom."
+"sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttr"
+"ibutesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\rsr\u0000\u0011java.la"
+"ng.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.Att"
+"ributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0018xq\u0000~\u0000\u0003q\u0000~\u0000\u001ep"
+"sr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u001d\u0001q\u0000~\u0000\"sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000"
+"com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\u0003q\u0000~\u0000#q\u0000~\u0000(sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000*xq"
+"\u0000~\u0000%t\u0000=com.sun.identity.liberty.ws.common.jaxb.xmlsig.KeyNam"
+"eElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0017"
+"pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\rq\u0000~\u0000\u001epsq\u0000~\u0000\u001fq\u0000~\u0000\u001epq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u0000>c"
+"om.sun.identity.liberty.ws.common.jaxb.xmlsig.KeyValueElemen"
+"tq\u0000~\u0000-sq\u0000~\u0000\u0017pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\rq\u0000~\u0000\u001epsq\u0000~\u0000\u001fq\u0000~\u0000\u001epq\u0000~\u0000\"q\u0000~\u0000&q\u0000~"
+"\u0000(sq\u0000~\u0000)t\u0000Ecom.sun.identity.liberty.ws.common.jaxb.xmlsig.Re"
+"trievalMethodElementq\u0000~\u0000-sq\u0000~\u0000\u0017pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\rq\u0000~\u0000\u001epsq\u0000~\u0000\u001f"
+"q\u0000~\u0000\u001epq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u0000>com.sun.identity.liberty.ws.co"
+"mmon.jaxb.xmlsig.X509DataElementq\u0000~\u0000-sq\u0000~\u0000\u0017pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\r"
+"q\u0000~\u0000\u001epsq\u0000~\u0000\u001fq\u0000~\u0000\u001epq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u0000=com.sun.identity.l"
+"iberty.ws.common.jaxb.xmlsig.PGPDataElementq\u0000~\u0000-sq\u0000~\u0000\u0017pp\u0000sq\u0000"
+"~\u0000\u000fppsq\u0000~\u0000\rq\u0000~\u0000\u001epsq\u0000~\u0000\u001fq\u0000~\u0000\u001epq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u0000>com.sun"
+".identity.liberty.ws.common.jaxb.xmlsig.SPKIDataElementq\u0000~\u0000-"
+"sq\u0000~\u0000\u0017pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\rq\u0000~\u0000\u001epsq\u0000~\u0000\u001fq\u0000~\u0000\u001epq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~"
+"\u0000)t\u0000>com.sun.identity.liberty.ws.common.jaxb.xmlsig.MgmtData"
+"Elementq\u0000~\u0000-sq\u0000~\u0000\u0017pp\u0000sq\u0000~\u0000\u001fppq\u0000~\u0000\"sr\u0000\'com.sun.msv.grammar.Di"
+"fferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u0018L\u0000\u0003nc2q\u0000~\u0000\u0018xq\u0000~\u0000%q\u0000~\u0000"
+"&sr\u0000#com.sun.msv.grammar.ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~"
+"\u0000\u0018L\u0000\u0003nc2q\u0000~\u0000\u0018xq\u0000~\u0000%sr\u0000&com.sun.msv.grammar.NamespaceNameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespaceURIq\u0000~\u0000*xq\u0000~\u0000%t\u0000\u0000sq\u0000~\u0000Xt\u0000\"http://www"
+".w3.org/2000/09/xmldsig#sq\u0000~\u0000Xq\u0000~\u0000-sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001fq\u0000~\u0000\u001epsr\u0000\u001bc"
+"om.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/da"
+"tatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/St"
+"ringPair;xq\u0000~\u0000\u0003ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com"
+".sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.da"
+"tatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun."
+"msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv"
+".datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatyp"
+"e.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000*L\u0000\btypeNa"
+"meq\u0000~\u0000*L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceP"
+"rocessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0002IDsr\u00005com.s"
+"un.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp"
+"\u0000sr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001epsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000"
+"\tlocalNameq\u0000~\u0000*L\u0000\fnamespaceURIq\u0000~\u0000*xpq\u0000~\u0000nq\u0000~\u0000msq\u0000~\u0000)t\u0000\u0002Idq\u0000"
+"~\u0000Zq\u0000~\u0000(sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001fq\u0000~\u0000\u001epsq\u0000~\u0000`q\u0000~\u0000\u001epsr\u0000#com.sun.msv.data"
+"type.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000hq\u0000~\u0000mt\u0000\u0006anyURIq\u0000~\u0000qq\u0000~\u0000s"
+"sq\u0000~\u0000tq\u0000~\u0000}q\u0000~\u0000msq\u0000~\u0000)t\u0000\u0003ACCt\u0000\u001durn:liberty:id-sis-pp:2003-08"
+"q\u0000~\u0000(sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001fq\u0000~\u0000\u001epsq\u0000~\u0000`ppsr\u0000%com.sun.msv.datatype.xs"
+"d.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateTi"
+"meBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000hq\u0000~\u0000mt\u0000\bdateTimeq\u0000~\u0000qq\u0000~\u0000ssq\u0000~\u0000tq"
+"\u0000~\u0000\u0088q\u0000~\u0000msq\u0000~\u0000)t\u0000\u0007ACCTimeq\u0000~\u0000\u0081q\u0000~\u0000(sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001fq\u0000~\u0000\u001epq\u0000~\u0000\u0084"
+"sq\u0000~\u0000)t\u0000\u0010modificationTimeq\u0000~\u0000\u0081q\u0000~\u0000(sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001fq\u0000~\u0000\u001epsq\u0000~\u0000"
+"`ppsr\u0000\'com.sun.msv.datatype.xsd.MaxLengthFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\t"
+"maxLengthxr\u00009com.sun.msv.datatype.xsd.DataTypeWithValueConst"
+"raintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWi"
+"thFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbas"
+"eTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcrete"
+"Typet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000"
+"~\u0000*xq\u0000~\u0000jt\u0000\u001curn:liberty:metadata:2003-08t\u0000\fentityIDTypeq\u0000~\u0000q"
+"\u0000\u0000q\u0000~\u0000|q\u0000~\u0000|t\u0000\tmaxLength\u0000\u0000\u0004\u0000q\u0000~\u0000ssq\u0000~\u0000tq\u0000~\u0000\u009aq\u0000~\u0000\u0099sq\u0000~\u0000)t\u0000\bmo"
+"difierq\u0000~\u0000\u0081q\u0000~\u0000(sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Close"
+"dHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0"
+"N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gra"
+"mmar/ExpressionPool;xp\u0000\u0000\u0000!\u0001pq\u0000~\u0000\u0010q\u0000~\u0000\u001cq\u0000~\u00000q\u0000~\u00006q\u0000~\u0000<q\u0000~\u0000Bq\u0000"
+"~\u0000Hq\u0000~\u0000Nq\u0000~\u0000\u0007q\u0000~\u0000xq\u0000~\u0000\u0015q\u0000~\u0000\u0013q\u0000~\u0000\u001bq\u0000~\u0000/q\u0000~\u00005q\u0000~\u0000;q\u0000~\u0000Aq\u0000~\u0000Gq\u0000"
+"~\u0000Mq\u0000~\u0000\tq\u0000~\u0000\u0082q\u0000~\u0000\bq\u0000~\u0000^q\u0000~\u0000\u0090q\u0000~\u0000\fq\u0000~\u0000\u0011q\u0000~\u0000\u008cq\u0000~\u0000\u0005q\u0000~\u0000\u0006q\u0000~\u0000\u0012q\u0000"
+"~\u0000\u0016q\u0000~\u0000\u000eq\u0000~\u0000\u0014x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "--------------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  12 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("KeyName" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("KeyValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("RetrievalMethod" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("X509Data" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("PGPData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SPKIData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MgmtData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (!(("" == ___uri)||("http://www.w3.org/2000/09/xmldsig#" == ___uri))) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  9 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 12;
                            eatText1(v);
                            continue outer;
                        }
                        state = 12;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText2(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  13 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText3(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText4(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Modifier = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ModificationTime = ((java.util.Calendar) com.sun.msv.datatype.xsd.DateTimeType.theInstance.createJavaObject(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value), null));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ACC = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ACCTime = ((java.util.Calendar) com.sun.msv.datatype.xsd.DateTimeType.theInstance.createJavaObject(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value), null));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  12 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 12;
                            eatText1(v);
                            continue outer;
                        }
                        state = 12;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText2(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  13 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText3(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText4(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
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
                    case  12 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        if (("modifier" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                    case  6 :
                        if (("modificationTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  13 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("ACC" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        if (("ACCTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
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
                    case  12 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("ACC" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 12;
                            eatText1(v);
                            continue outer;
                        }
                        state = 12;
                        continue outer;
                    case  8 :
                        if (("modificationTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText2(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  13 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText3(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText4(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  11 :
                        if (("modifier" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 12;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("ACCTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            state = 6;
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
                        case  12 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.KeyInfoTypeImpl.this).new Unmarshaller(context)), 13, value);
                            return ;
                        case  7 :
                            state = 8;
                            eatText2(value);
                            return ;
                        case  10 :
                            state = 11;
                            eatText1(value);
                            return ;
                        case  9 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 12;
                                eatText1(v);
                                continue outer;
                            }
                            state = 12;
                            continue outer;
                        case  6 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 9;
                                eatText2(v);
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  13 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            state = 2;
                            eatText3(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText3(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  3 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 6;
                                eatText4(v);
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  4 :
                            state = 5;
                            eatText4(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
