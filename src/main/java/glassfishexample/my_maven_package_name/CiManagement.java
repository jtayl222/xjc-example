
package glassfishexample.my_maven_package_name;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         
 *         The <code>&lt;CiManagement&gt;</code> element contains informations required to the
 *         continuous integration system of the project.
 *         
 *       
 * 
 * <p>Java class for CiManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CiManagement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="notifiers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="notifier" type="{http://maven.apache.org/POM/4.0.0}Notifier" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CiManagement", propOrder = {

})
public class CiManagement {

    protected String system;
    protected String url;
    protected CiManagement.Notifiers notifiers;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the notifiers property.
     * 
     * @return
     *     possible object is
     *     {@link CiManagement.Notifiers }
     *     
     */
    public CiManagement.Notifiers getNotifiers() {
        return notifiers;
    }

    /**
     * Sets the value of the notifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CiManagement.Notifiers }
     *     
     */
    public void setNotifiers(CiManagement.Notifiers value) {
        this.notifiers = value;
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
     *         <element name="notifier" type="{http://maven.apache.org/POM/4.0.0}Notifier" maxOccurs="unbounded" minOccurs="0"/>
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
        "notifier"
    })
    public static class Notifiers {

        protected List<Notifier> notifier;

        /**
         * Gets the value of the notifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the notifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Notifier }
         * 
         * 
         * @return
         *     The value of the notifier property.
         */
        public List<Notifier> getNotifier() {
            if (notifier == null) {
                notifier = new ArrayList<>();
            }
            return this.notifier;
        }

    }

}
