
package generated;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weapon", namespace = "http://www.example.com/Weapon", propOrder = {
    "name",
    "damage",
    "holder"
})
public class Weapon {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected BigDecimal damage;
    @XmlElement(required = true)
    protected Holder holder;
    @XmlAttribute(name = "serialId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String serialId;
    @XmlAttribute(name = "kind", required = true)
    protected Kind kind;


    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public BigDecimal getDamage() {
        return damage;
    }


    public void setDamage(BigDecimal value) {
        this.damage = value;
    }


    public Holder getHolder() {
        return holder;
    }


    public void setHolder(Holder value) {
        this.holder = value;
    }


    public String getSerialId() {
        return serialId;
    }


    public void setSerialId(String value) {
        this.serialId = value;
    }


    public Kind getKind() {
        return kind;
    }


    public void setKind(Kind value) {
        this.kind = value;
    }

}
