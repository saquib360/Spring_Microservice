package com.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.payment.model.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, String>{



}
