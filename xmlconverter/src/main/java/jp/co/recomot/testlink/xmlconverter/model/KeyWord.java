package jp.co.recomot.testlink.xmlconverter.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "keyword")
public class KeyWord {

	private String name;

	public String getName() {
		return name;
	}

	@XmlAttribute(name = "name")
	public void setName(String name) {
		this.name = name;
	}
}
