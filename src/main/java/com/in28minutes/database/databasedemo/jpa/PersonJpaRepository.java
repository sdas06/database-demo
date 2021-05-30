package com.in28minutes.database.databasedemo.jpa;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	//connect to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findByIds(int id) {
		return entityManager.find(Person.class, id);//JPA
	}
	
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_allPersons", Person.class);
		return namedQuery.getResultList();
	}

}
