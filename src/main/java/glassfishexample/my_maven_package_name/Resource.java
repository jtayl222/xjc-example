
package glassfishexample.my_maven_package_name;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This element describes all of the classpath resources associated with a project
 *         or unit tests.
 * 
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Resource">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="targetPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="filtering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="includes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="include" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="excludes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="exclude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Resource", propOrder = {

})
public class Resource {

    protected String targetPath;
    protected String filtering;
    protected String directory;
    protected Resource.Includes includes;
    protected Resource.Excludes excludes;

    /**
     * Gets the value of the targetPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * Sets the value of the targetPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPath(String value) {
        this.targetPath = value;
    }

    /**
     * Gets the value of the filtering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltering() {
        return filtering;
    }

    /**
     * Sets the value of the filtering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltering(String value) {
        this.filtering = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Includes }
     *     
     */
    public Resource.Includes getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Includes }
     *     
     */
    public void setIncludes(Resource.Includes value) {
        this.includes = value;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Excludes }
     *     
     */
    public Resource.Excludes getExcludes() {
        return excludes;
    }

    /**
     * Sets the value of the excludes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Excludes }
     *     
     */
    public void setExcludes(Resource.Excludes value) {
        this.excludes = value;
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
     *         <element name="exclude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "exclude"
    })
    public static class Excludes {

        protected List<String> exclude;

        /**
         * Gets the value of the exclude property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the exclude property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExclude().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the exclude property.
         */
        public List<String> getExclude() {
            if (exclude == null) {
                exclude = new ArrayList<>();
            }
            return this.exclude;
        }

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
     *         <element name="include" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "include"
    })
    public static class Includes {

        protected List<String> include;

        /**
         * Gets the value of the include property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the include property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInclude().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the include property.
         */
        public List<String> getInclude() {
            if (include == null) {
                include = new ArrayList<>();
            }
            return this.include;
        }

    }

}
