
package mx.gob.imss.cit.bp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.Actor;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseObject;
import mx.gob.imss.cit.bp.ws.bovedapersonalcommonschema.BaseRequest;


/**
 * <p>Java class for AddFolderActorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddFolderActorRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bp.cit.imss.gob.mx/bovedaPersonalCommonSchema}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Object" type="{http://ws.bp.cit.imss.gob.mx/bovedaPersonalCommonSchema}BaseObject"/>
 *         &lt;element name="Actor" type="{http://ws.bp.cit.imss.gob.mx/bovedaPersonalCommonSchema}Actor"/>
 *         &lt;element name="newActor" type="{http://ws.bp.cit.imss.gob.mx/bovedaPersonalCommonSchema}Actor"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFolderActorRequest", propOrder = {
    "object",
    "actor",
    "newActor"
})
public class AddFolderActorRequest
    extends BaseRequest
{

    @XmlElement(name = "Object", required = true)
    protected BaseObject object;
    @XmlElement(name = "Actor", required = true)
    protected Actor actor;
    @XmlElement(required = true)
    protected Actor newActor;

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
     * Gets the value of the newActor property.
     * 
     * @return
     *     possible object is
     *     {@link Actor }
     *     
     */
    public Actor getNewActor() {
        return newActor;
    }

    /**
     * Sets the value of the newActor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actor }
     *     
     */
    public void setNewActor(Actor value) {
        this.newActor = value;
    }

}
