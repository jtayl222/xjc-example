
package glassfishexample.my_maven_package_name;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The conditions within the build runtime environment which will trigger the
 *         automatic inclusion of the build profile. Multiple conditions can be defined, which must
 *         be all satisfied to activate the profile.
 *       
 * 
 * <p>Java class for Activation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Activation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="activeByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="jdk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="os" type="{http://maven.apache.org/POM/4.0.0}ActivationOS" minOccurs="0"/>
 *         <element name="property" type="{http://maven.apache.org/POM/4.0.0}ActivationProperty" minOccurs="0"/>
 *         <element name="file" type="{http://maven.apache.org/POM/4.0.0}ActivationFile" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activation", propOrder = {

})
public class Activation {

    @XmlElement(defaultValue = "false")
    protected Boolean activeByDefault;
    protected String jdk;
    protected ActivationOS os;
    protected ActivationProperty property;
    protected ActivationFile file;

    /**
     * Gets the value of the activeByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveByDefault() {
        return activeByDefault;
    }

    /**
     * Sets the value of the activeByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveByDefault(Boolean value) {
        this.activeByDefault = value;
    }

    /**
     * Gets the value of the jdk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJdk() {
        return jdk;
    }

    /**
     * Sets the value of the jdk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJdk(String value) {
        this.jdk = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationOS }
     *     
     */
    public ActivationOS getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationOS }
     *     
     */
    public void setOs(ActivationOS value) {
        this.os = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationProperty }
     *     
     */
    public ActivationProperty getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationProperty }
     *     
     */
    public void setProperty(ActivationProperty value) {
        this.property = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationFile }
     *     
     */
    public ActivationFile getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationFile }
     *     
     */
    public void setFile(ActivationFile value) {
        this.file = value;
    }

}
