package org.example.repository.abstracts;

import org.example.model.concretes.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookDao extends MongoRepository<Book, String> {
}
