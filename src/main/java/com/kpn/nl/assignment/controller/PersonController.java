package com.kpn.nl.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kpn.nl.assignment.person.Person;
import com.kpn.nl.assignment.service.PersonService;


/**
 * The Class PersonController.
 */
@RestController
@Component
public class PersonController {
	
	/** The person service. */
	@Autowired
	private PersonService personService;

	/**
	 * Gets the person by id.
	 *
	 * @param id the id
	 * @return the person by id
	 */
	@RequestMapping(value = "/api/personapp/v1/person/id/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE , consumes = MediaType.ALL_VALUE)
	public ResponseEntity<Person> getPersonById(@PathVariable int id) {
		
		Person person=personService.getPerson(id);
		if(person==null) {
			return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
		}
		
		return ResponseEntity.ok().body(person);
	}

}
