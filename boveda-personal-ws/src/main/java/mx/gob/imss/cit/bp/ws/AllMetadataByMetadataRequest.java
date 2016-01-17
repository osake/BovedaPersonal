
package mx.gob.imss.cit.bp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseRequest;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Metadata;


/**
 * <p>Java class for AllMetadataByMetadataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllMetadataByMetadataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bp.cit.imss.gob.mx/bovedaPersonalCommonSchema}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Actor" type="{http://ws.bp.cit.imss.gob.mx/bovedaPersonalCommonSchema}Actor"/>
 *         &lt;element name="Object" type="{http://ws.bp.cit.imss.gob.mx/bovedaPersonalCommonSchema}BaseObject"/>
 *         &lt;element name="Metadata" type="{http://ws.bp.cit.imss.gob.mx/bovedaPersonalCommonSchema}Metadata"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllMetadataByMetadataRequest", propOrder = {
    "actor",
    "object",
    "metadata"
})
public class AllMetadataByMetadataRequest
    extends BaseRequest
{

    @XmlElement(name = "Actor", required = true)
    protected Actor actor;
    @XmlElement(name = "Object", required = true)
    protected BaseObject object;
    @XmlElement(name = "Metadata", required = true)
    protected Metadata metadata;

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link Actor }
     *     
     */
    public Actor getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actor }
     *     
     */
    public void setActor(Actor value) {
        this.actor = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link BaseObject }
     *     
     */
    public BaseObject getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseObject }
     *     
     */
    public void setObject(BaseObject value) {
        this.object = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link Metadata }
     *     
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata }
     *     
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

}
