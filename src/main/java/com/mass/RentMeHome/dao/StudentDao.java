package com.mass.RentMeHome.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mass.RentMeHome.model.Student;

public interface StudentDao extends MongoRepository<Student, String>{
	
	@Query("{ 'email' : ?0 }")
	Student findByEmail(String email);
}
