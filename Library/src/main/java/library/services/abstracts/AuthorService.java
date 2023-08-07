package library.services.abstracts;

import library.dto.CreateAuthorRequest;
import library.dto.CreateAuthorResponse;
import library.model.concretes.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthor();
    CreateAuthorResponse addAuthor(CreateAuthorRequest request);
    String deleteAuthor(int id);
    String updateAuthor(int id, Author newAuthor);

    Author getById(int id);

    //String matchBookToAuthor(int id, Author author);

}
