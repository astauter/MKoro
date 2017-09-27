package com.MKoro.entity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.MKoro.entity.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "signup")
public interface UserRepository extends MongoRepository<User, String> {
	
}
