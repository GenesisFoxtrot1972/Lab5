
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Holder", namespace = "http://www.example.com/Weapon", propOrder = {
    "capacity",
    "caliber"
})
public class Holder {

    @XmlElement(required = true)
    protected BigInteger capacity;
    protected float caliber;


    public BigInteger getCapacity() {
        return capacity;
    }


    public void setCapacity(BigInteger value) {
        this.capacity = value;
    }


    public float getCaliber() {
        return caliber;
    }


    public void setCaliber(float value) {
        this.caliber = value;
    }

}
