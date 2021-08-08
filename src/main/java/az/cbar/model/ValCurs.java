package az.cbar.model;

import lombok.Getter;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;

@ToString
@XmlRootElement(name = "ValCurs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValCurs {
    @Getter
    @XmlAttribute(name = "Date")
    private String date;
    @Getter
    @XmlAttribute(name = "Name")
    private String name;
    @Getter
    @XmlAttribute(name = "Description")
    private String description;
    @Getter
    @XmlElement(name = "ValType")
    private List<ValType> valType;
}
