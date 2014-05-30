
package generated;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "weapon"
})
@XmlRootElement(name = "Weapons", namespace = "http://www.example.com/Weapon")
public class Weapons {

    @XmlElement(required = true)
    protected List<Weapon> weapon;

    public List<Weapon> getWeapon() {
        if (weapon == null) {
            weapon = new ArrayList<Weapon>();
        }
        return this.weapon;
    }

    public void setWeapon(List<Weapon> weapon) {
        this.weapon = weapon;
    }
}
