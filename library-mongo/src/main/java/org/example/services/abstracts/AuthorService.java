package org.example.services.abstracts;

import org.example.dto.CreateAuthorRequest;
import org.example.dto.CreateAuthorResponse;
import org.example.model.concretes.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthor();
    CreateAuthorResponse addAuthor(CreateAuthorRequest request);
    String deleteAuthor(int id);
    String updateAuthor(int id, Author newAuthor);

    Author getById(int id);

    //String matchBookToAuthor(int id, Author author);

}
