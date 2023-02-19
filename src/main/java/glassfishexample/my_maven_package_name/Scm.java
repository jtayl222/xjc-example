
package glassfishexample.my_maven_package_name;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         
 *         The <code>&lt;scm&gt;</code> element contains informations required to the SCM
 *         (Source Control Management) of the project.
 *         
 *       
 * 
 * <p>Java class for Scm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Scm">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="developerConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *       <attribute name="child.scm.connection.inherit.append.path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="child.scm.developerConnection.inherit.append.path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="child.scm.url.inherit.append.path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scm", propOrder = {

})
public class Scm {

    protected String connection;
    protected String developerConnection;
    @XmlElement(defaultValue = "HEAD")
    protected String tag;
    protected String url;
    @XmlAttribute(name = "child.scm.connection.inherit.append.path")
    protected String childScmConnectionInheritAppendPath;
    @XmlAttribute(name = "child.scm.developerConnection.inherit.append.path")
    protected String childScmDeveloperConnectionInheritAppendPath;
    @XmlAttribute(name = "child.scm.url.inherit.append.path")
    protected String childScmUrlInheritAppendPath;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnection(String value) {
        this.connection = value;
    }

    /**
     * Gets the value of the developerConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperConnection() {
        return developerConnection;
    }

    /**
     * Sets the value of the developerConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperConnection(String value) {
        this.developerConnection = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
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
     * Gets the value of the childScmConnectionInheritAppendPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildScmConnectionInheritAppendPath() {
        return childScmConnectionInheritAppendPath;
    }

    /**
     * Sets the value of the childScmConnectionInheritAppendPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildScmConnectionInheritAppendPath(String value) {
        this.childScmConnectionInheritAppendPath = value;
    }

    /**
     * Gets the value of the childScmDeveloperConnectionInheritAppendPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildScmDeveloperConnectionInheritAppendPath() {
        return childScmDeveloperConnectionInheritAppendPath;
    }

    /**
     * Sets the value of the childScmDeveloperConnectionInheritAppendPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildScmDeveloperConnectionInheritAppendPath(String value) {
        this.childScmDeveloperConnectionInheritAppendPath = value;
    }

    /**
     * Gets the value of the childScmUrlInheritAppendPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildScmUrlInheritAppendPath() {
        return childScmUrlInheritAppendPath;
    }

    /**
     * Sets the value of the childScmUrlInheritAppendPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildScmUrlInheritAppendPath(String value) {
        this.childScmUrlInheritAppendPath = value;
    }

}
