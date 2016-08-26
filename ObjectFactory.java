//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.25 at 04:44:56 PM PDT 
//


package codesample.xmlparsing;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Itemlist_QNAME = new QName("", "itemlist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemlistType }
     * 
     */
    public ItemlistType createItemlistType() {
        return new ItemlistType();
    }

    /**
     * Create an instance of {@link SubitemsType }
     * 
     */
    public SubitemsType createSubitemsType() {
        return new SubitemsType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link SubitemType }
     * 
     */
    public SubitemType createSubitemType() {
        return new SubitemType();
    }

    /**
     * Create an instance of {@link ItemsType }
     * 
     */
    public ItemsType createItemsType() {
        return new ItemsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemlistType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "itemlist")
    public JAXBElement<ItemlistType> createItemlist(ItemlistType value) {
        return new JAXBElement<ItemlistType>(_Itemlist_QNAME, ItemlistType.class, null, value);
    }

}