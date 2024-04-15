
package ru.nsu.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for person-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wife" type="{}person-ref" minOccurs="0"/&gt;
 *         &lt;element name="husband" type="{}person-ref" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{}parents-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="siblings" type="{}siblings-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="children" type="{}children-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="name" type="{}name-type" /&gt;
 *       &lt;attribute name="gender" type="{}gender-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person-type", propOrder = {
    "wife",
    "husband",
    "parents",
    "siblings",
    "children"
})
public class PersonType {

    protected PersonRef wife;
    protected PersonRef husband;
    protected List<ParentsType> parents;
    protected List<SiblingsType> siblings;
    protected List<ChildrenType> children;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "gender")
    protected GenderType gender;

    /**
     * Gets the value of the wife property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRef }
     *     
     */
    public PersonRef getWife() {
        return wife;
    }

    /**
     * Sets the value of the wife property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRef }
     *     
     */
    public void setWife(PersonRef value) {
        this.wife = value;
    }

    /**
     * Gets the value of the husband property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRef }
     *     
     */
    public PersonRef getHusband() {
        return husband;
    }

    /**
     * Sets the value of the husband property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRef }
     *     
     */
    public void setHusband(PersonRef value) {
        this.husband = value;
    }

    /**
     * Gets the value of the parents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParentsType }
     * 
     * 
     */
    public List<ParentsType> getParents() {
        if (parents == null) {
            parents = new ArrayList<ParentsType>();
        }
        return this.parents;
    }

    /**
     * Gets the value of the siblings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the siblings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiblings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiblingsType }
     * 
     * 
     */
    public List<SiblingsType> getSiblings() {
        if (siblings == null) {
            siblings = new ArrayList<SiblingsType>();
        }
        return this.siblings;
    }

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildrenType }
     * 
     * 
     */
    public List<ChildrenType> getChildren() {
        if (children == null) {
            children = new ArrayList<ChildrenType>();
        }
        return this.children;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

}
