
package glassfishexample.my_maven_package_name;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Section for management of reports and their configuration.
 * 
 * <p>Java class for Reporting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Reporting">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="excludeDefaults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="outputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="plugins" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="plugin" type="{http://maven.apache.org/POM/4.0.0}ReportPlugin" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Reporting", propOrder = {

})
public class Reporting {

    protected String excludeDefaults;
    protected String outputDirectory;
    protected Reporting.Plugins plugins;

    /**
     * Gets the value of the excludeDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeDefaults() {
        return excludeDefaults;
    }

    /**
     * Sets the value of the excludeDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeDefaults(String value) {
        this.excludeDefaults = value;
    }

    /**
     * Gets the value of the outputDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Sets the value of the outputDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDirectory(String value) {
        this.outputDirectory = value;
    }

    /**
     * Gets the value of the plugins property.
     * 
     * @return
     *     possible object is
     *     {@link Reporting.Plugins }
     *     
     */
    public Reporting.Plugins getPlugins() {
        return plugins;
    }

    /**
     * Sets the value of the plugins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reporting.Plugins }
     *     
     */
    public void setPlugins(Reporting.Plugins value) {
        this.plugins = value;
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
     *         <element name="plugin" type="{http://maven.apache.org/POM/4.0.0}ReportPlugin" maxOccurs="unbounded" minOccurs="0"/>
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
        "plugin"
    })
    public static class Plugins {

        protected List<ReportPlugin> plugin;

        /**
         * Gets the value of the plugin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the plugin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlugin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportPlugin }
         * 
         * 
         * @return
         *     The value of the plugin property.
         */
        public List<ReportPlugin> getPlugin() {
            if (plugin == null) {
                plugin = new ArrayList<>();
            }
            return this.plugin;
        }

    }

}
