package com.cts.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.Utility;
import com.cts.demo.model.Person;
import com.cts.demo.service.PermanentPersonService;
import com.cts.demo.service.PermanentPersonServiceImpl;

@RestController
public class PersonController {
	
	@Autowired
	PermanentPersonService personService;  //Default It's Type
	
	public PersonController() {
				
	}
	
	@GetMapping(value = "/personList")
	public ResponseEntity<Object> personList()
	{
		
		return new ResponseEntity<>(personService.getAllPerson(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getProductById/{id}")
	public ResponseEntity<Object> personList(@PathVariable("id") Integer id)
	{
			//The error message was not being displayed if the record was not found, so changed the implementation in service class
			Person person=personService.getPersonById(id);
			if(person!=null) {
				
				return new ResponseEntity<>(person,HttpStatus.OK);	
			}
			else
				return new ResponseEntity<>("Record Not Found",HttpStatus.OK);
				
	}
	
	
	@PostMapping(value = "/addPerson")
	public ResponseEntity<Object> addPerson(@RequestBody Person person)
	{
		
		return new ResponseEntity<>(personService.addPerson(person),HttpStatus.OK);	
	}
	
	@PutMapping(value = "/updatePerson")
	public ResponseEntity<Object> updatePerson(@RequestBody Person person)
	{
		//Updated the method to not create new entry each time if the input Id was not found
		Person personTemp=personService.updatePerson(person);
		if(personTemp!=null) {
			
			return new ResponseEntity<>(personTemp,HttpStatus.OK);	
		}
		else
		return new ResponseEntity<>("Record Not Found",HttpStatus.OK);
	}

}
