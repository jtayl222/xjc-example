
package glassfishexample.my_maven_package_name;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Section for management of default plugin information for use in a group of POMs.
 *       
 * 
 * <p>Java class for PluginManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PluginManagement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="plugins" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="plugin" type="{http://maven.apache.org/POM/4.0.0}Plugin" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PluginManagement", propOrder = {

})
public class PluginManagement {

    protected PluginManagement.Plugins plugins;

    /**
     * Gets the value of the plugins property.
     * 
     * @return
     *     possible object is
     *     {@link PluginManagement.Plugins }
     *     
     */
    public PluginManagement.Plugins getPlugins() {
        return plugins;
    }

    /**
     * Sets the value of the plugins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginManagement.Plugins }
     *     
     */
    public void setPlugins(PluginManagement.Plugins value) {
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
     *         <element name="plugin" type="{http://maven.apache.org/POM/4.0.0}Plugin" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<Plugin> plugin;

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
         * {@link Plugin }
         * 
         * 
         * @return
         *     The value of the plugin property.
         */
        public List<Plugin> getPlugin() {
            if (plugin == null) {
                plugin = new ArrayList<>();
            }
            return this.plugin;
        }

    }

}
