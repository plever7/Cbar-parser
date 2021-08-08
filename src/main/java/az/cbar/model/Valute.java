package az.cbar.model;

import lombok.Getter;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

@XmlRootElement(name = "Valute")
@XmlAccessorType(XmlAccessType.FIELD)
public class Valute {
    @Getter
    @XmlAttribute(name = "Code")
    private String code;
    @Getter
    @XmlElement(name = "Nominal")
    private int nominal;
    @Getter
    @XmlElement(name = "Name")
    private String name;
    @Getter
    @XmlElement(name = "Value")
    private BigDecimal value;

    private final DecimalFormat decimalFormat = new DecimalFormat("0.0000");

    @Override
    public String toString() {
        return String.format("%45s %20s %20s %20s", name, nominal, code, decimalFormat.format(value));
    }

}
