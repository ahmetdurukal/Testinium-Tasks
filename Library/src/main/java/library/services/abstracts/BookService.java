package library.services.abstracts;
import library.dto.CreateBookRequest;
import library.dto.CreateBookResponse;
import library.model.concretes.Book;

import java.net.CacheResponse;
import java.util.List;

public interface BookService {
    List<Book>getAll();
    CreateBookResponse add(CreateBookRequest request);

    String delete(int id);
    String update(int id,Book newBook);

    //Integer addBookWithAuthorId(int id);
    Book changeBookAuthor(int bookId,int authorId);
}
