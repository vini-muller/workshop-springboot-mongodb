package com.viniciusmuller.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viniciusmuller.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

		
	
}
