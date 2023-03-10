
package glassfishexample.my_maven_package_name;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This element describes all of the mailing lists associated with a project. The
 *         auto-generated site references this information.
 * 
 * <p>Java class for MailingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MailingList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="unsubscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="post" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="archive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="otherArchives" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="otherArchive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailingList", propOrder = {

})
public class MailingList {

    protected String name;
    protected String subscribe;
    protected String unsubscribe;
    protected String post;
    protected String archive;
    protected MailingList.OtherArchives otherArchives;

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
     * Gets the value of the subscribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribe() {
        return subscribe;
    }

    /**
     * Sets the value of the subscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribe(String value) {
        this.subscribe = value;
    }

    /**
     * Gets the value of the unsubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsubscribe() {
        return unsubscribe;
    }

    /**
     * Sets the value of the unsubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsubscribe(String value) {
        this.unsubscribe = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPost(String value) {
        this.post = value;
    }

    /**
     * Gets the value of the archive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchive(String value) {
        this.archive = value;
    }

    /**
     * Gets the value of the otherArchives property.
     * 
     * @return
     *     possible object is
     *     {@link MailingList.OtherArchives }
     *     
     */
    public MailingList.OtherArchives getOtherArchives() {
        return otherArchives;
    }

    /**
     * Sets the value of the otherArchives property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingList.OtherArchives }
     *     
     */
    public void setOtherArchives(MailingList.OtherArchives value) {
        this.otherArchives = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="otherArchive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherArchive"
    })
    public static class OtherArchives {

        protected List<String> otherArchive;

        /**
         * Gets the value of the otherArchive property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the otherArchive property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherArchive().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the otherArchive property.
         */
        public List<String> getOtherArchive() {
            if (otherArchive == null) {
                otherArchive = new ArrayList<>();
            }
            return this.otherArchive;
        }

    }

}
