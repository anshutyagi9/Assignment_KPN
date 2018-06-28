package com.kpn.nl.assignment.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "name",
    "age"
})
@XmlRootElement(name = "person")
public class Person {

    /** The id. */
    protected int id;
    
    /** The name. */
    @XmlElement(required = true)
    protected String name;
    
    /** The age. */
    protected int age;
    
    /**
     * Instantiates a new person.
     */
    public Person() {
    	
    }

    /**
     * Instantiates a new person.
     *
     * @param id the id
     * @param name the name
     * @param age the age
     */
    public Person(int id, String name, int age) {
    	super();
		this.id= id;
		this.name = name;
		this.age= age;
	}

	/**
	 * Gets the value of the id property.
	 *
	 * @return the id
	 */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value the new id
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the age property.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     *
     * @param value the new age
     */
    public void setAge(int value) {
        this.age = value;
    }

}
