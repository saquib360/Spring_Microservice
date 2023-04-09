package com.mongoTest.testdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongoTest.testdb.model.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, String>{



}