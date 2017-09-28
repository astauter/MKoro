package com.MKoro.entity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.MKoro.entity.Message;

// database
@RepositoryRestResource(collectionResourceRel = "message", path = "message")
public interface MessageRepository extends MongoRepository<Message, String> {

}
