
package ru.nsu.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import ru.nsu.schema.PersonRef;


/**
 * <p>Java class for siblings-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="siblings-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sister" type="{}person-ref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="brother" type="{}person-ref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siblings-type", propOrder = {
    "sister",
    "brother"
})
public class SiblingsType {

    protected List<PersonRef> sister;
    protected List<PersonRef> brother;

    /**
     * Gets the value of the sister property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sister property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSister().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonRef }
     * 
     * 
     */
    public List<PersonRef> getSister() {
        if (sister == null) {
            sister = new ArrayList<PersonRef>();
        }
        return this.sister;
    }

    /**
     * Gets the value of the brother property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the brother property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrother().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonRef }
     * 
     * 
     */
    public List<PersonRef> getBrother() {
        if (brother == null) {
            brother = new ArrayList<PersonRef>();
        }
        return this.brother;
    }

}
