package _03_xml._04_jaxb.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@ToString
public class JaxbCat {
    @XmlAttribute
    private int number;
    private String name;
    private int age;
}
