//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.25 at 04:44:56 PM PDT 
//


package codesample.xmlparsing;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="item1"/>
 *               &lt;enumeration value="item2"/>
 *               &lt;enumeration value="item3"/>
 *               &lt;enumeration value="item4"/>
 *               &lt;enumeration value="item5"/>
 *               &lt;enumeration value="subItem1"/>
 *               &lt;enumeration value="item6"/>
 *               &lt;enumeration value="item7"/>
 *               &lt;enumeration value="subItem2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="label" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Item 2"/>
 *               &lt;enumeration value="Item 7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="subitems" type="{}subitemsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = {
    "id",
    "label",
    "subitems"
})
public class ItemType {

    @XmlElement(required = true)
    protected String id;
    protected String label;
    protected SubitemsType subitems;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the subitems property.
     * 
     * @return
     *     possible object is
     *     {@link SubitemsType }
     *     
     */
    public SubitemsType getSubitems() {
        return subitems;
    }

    /**
     * Sets the value of the subitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubitemsType }
     *     
     */
    public void setSubitems(SubitemsType value) {
        this.subitems = value;
    }

}