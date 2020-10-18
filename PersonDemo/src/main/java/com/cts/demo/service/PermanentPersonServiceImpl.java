package com.cts.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.demo.dao.PersonDao;
import com.cts.demo.dao.PersonDaoImpl;
import com.cts.demo.dao.jpa.PersonJpaDao;
import com.cts.demo.model.Person;


@Service(value = "personService")
public class PermanentPersonServiceImpl implements PermanentPersonService{

	@Autowired
	PersonDao personDao;
	
	@Autowired
	PersonJpaDao personJpaDao;
	
	@Override
	public Iterable<Person> getAllPerson() {
		// TODO Auto-generated method stub
		
		
		return personJpaDao.findAll();
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		Optional<Person> p = personJpaDao.findById(id);
		if(p.isPresent())
			return p.get();
		else
			return null;
	}

	@Override
	public Person addPerson(Person person) {
		// TODO Auto-generated method stub
		
		return personJpaDao.save(person);
	}

	@Override
	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		System.out.println(personJpaDao.findById(person.getId()));
		if(!personJpaDao.findById(person.getId()).isPresent()){
			return null;
		}
		return personJpaDao.save(person);
	}

}
