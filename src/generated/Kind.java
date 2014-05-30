
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



@XmlType(name = "Kind", namespace = "http://www.example.com/Weapon")
@XmlEnum
public enum Kind {

    @XmlEnumValue("Gun")
    GUN("Gun"),
    @XmlEnumValue("Rifle")
    RIFLE("Rifle"),
    @XmlEnumValue("Bazooka")
    BAZOOKA("Bazooka");
    private final String value;

    Kind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Kind fromValue(String v) {
        for (Kind c: Kind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
