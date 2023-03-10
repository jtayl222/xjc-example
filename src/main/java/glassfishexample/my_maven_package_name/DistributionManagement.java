
package glassfishexample.my_maven_package_name;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This elements describes all that pertains to distribution for a project. It is
 *         primarily used for deployment of artifacts and the site produced by the build.
 * 
 * <p>Java class for DistributionManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DistributionManagement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="repository" type="{http://maven.apache.org/POM/4.0.0}DeploymentRepository" minOccurs="0"/>
 *         <element name="snapshotRepository" type="{http://maven.apache.org/POM/4.0.0}DeploymentRepository" minOccurs="0"/>
 *         <element name="site" type="{http://maven.apache.org/POM/4.0.0}Site" minOccurs="0"/>
 *         <element name="downloadUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="relocation" type="{http://maven.apache.org/POM/4.0.0}Relocation" minOccurs="0"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionManagement", propOrder = {

})
public class DistributionManagement {

    protected DeploymentRepository repository;
    protected DeploymentRepository snapshotRepository;
    protected Site site;
    protected String downloadUrl;
    protected Relocation relocation;
    protected String status;

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentRepository }
     *     
     */
    public DeploymentRepository getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentRepository }
     *     
     */
    public void setRepository(DeploymentRepository value) {
        this.repository = value;
    }

    /**
     * Gets the value of the snapshotRepository property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentRepository }
     *     
     */
    public DeploymentRepository getSnapshotRepository() {
        return snapshotRepository;
    }

    /**
     * Sets the value of the snapshotRepository property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentRepository }
     *     
     */
    public void setSnapshotRepository(DeploymentRepository value) {
        this.snapshotRepository = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

    /**
     * Gets the value of the downloadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * Sets the value of the downloadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadUrl(String value) {
        this.downloadUrl = value;
    }

    /**
     * Gets the value of the relocation property.
     * 
     * @return
     *     possible object is
     *     {@link Relocation }
     *     
     */
    public Relocation getRelocation() {
        return relocation;
    }

    /**
     * Sets the value of the relocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relocation }
     *     
     */
    public void setRelocation(Relocation value) {
        this.relocation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
