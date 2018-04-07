package com.iqmsoft.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.dto.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

	
	@RequestMapping("/{personId}")
	public Person getById(@PathVariable String personId) {
		Person person = new Person();
		person.setId(personId);
		person.setName("A Persons Name");
		return person;
	}
	
}
