package com.kpn.nl.assignment.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kpn.nl.assignment.person.Person;


/**
 * The Class PersonService.
 */
@Service
@Configurable
@Component
public class PersonService {
	
	/** The person list. */
	private List<Person> personList = Arrays.asList(new Person(1, "Anshu", 21), 
			new Person(2, "Ed", 22), new Person(3, "Dennis", 31));
	
	
	/**
	 * Gets the person.
	 *
	 * @param id the id
	 * @return the person
	 */
	public Person getPerson(int id) {
	
		Person person2 = null;
		for(Person person : personList) {
			if (person.getId()==id) {
				 person2= person;
			}
		}
		
		return person2;
		
	}	

}
