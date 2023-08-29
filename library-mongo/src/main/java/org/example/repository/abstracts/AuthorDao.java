package org.example.repository.abstracts;

import org.example.model.concretes.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorDao extends MongoRepository<Author,String> {

}
