//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.01 at 02:55:21 PM CEST 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.validation.XmlRevocationOrigin;

public class Adapter7
    extends XmlAdapter<String, XmlRevocationOrigin>
{


    public XmlRevocationOrigin unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationOriginTypeParser.parse(value));
    }

    public String marshal(XmlRevocationOrigin value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationOriginTypeParser.print(value));
    }

}
