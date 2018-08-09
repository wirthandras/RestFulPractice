package hu.wia.practice.restful.restfuldomain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Greeting implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5009458885596449755L;
	
	@XmlElement
	private long id;
	@XmlElement
	private String content;
	
	public Greeting() {
		
	}
	

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
