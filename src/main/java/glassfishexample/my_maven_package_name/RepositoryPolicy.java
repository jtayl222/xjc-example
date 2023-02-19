
package glassfishexample.my_maven_package_name;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Download policy.
 * 
 * <p>Java class for RepositoryPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RepositoryPolicy">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="updatePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="checksumPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryPolicy", propOrder = {

})
public class RepositoryPolicy {

    protected String enabled;
    protected String updatePolicy;
    protected String checksumPolicy;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the updatePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatePolicy() {
        return updatePolicy;
    }

    /**
     * Sets the value of the updatePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatePolicy(String value) {
        this.updatePolicy = value;
    }

    /**
     * Gets the value of the checksumPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksumPolicy() {
        return checksumPolicy;
    }

    /**
     * Sets the value of the checksumPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksumPolicy(String value) {
        this.checksumPolicy = value;
    }

}
