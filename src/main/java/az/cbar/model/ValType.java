package az.cbar.model;

import lombok.Getter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@ToString
public class ValType {
    @Getter
    @XmlAttribute(name = "Type")
    private String type;

    @Getter
    @XmlElement(name = "Valute")
    private List<Valute> valute;
}
