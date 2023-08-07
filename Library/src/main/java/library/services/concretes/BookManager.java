package library.services.concretes;
import library.dto.CreateBookRequest;
import library.dto.CreateBookResponse;
import library.model.concretes.Author;
import library.services.abstracts.AuthorService;
import library.services.abstracts.BookService;
import library.repository.abstracts.BookDao;
import library.model.concretes.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BookManager implements BookService {
    private final BookDao bookDao;
    private final AuthorService authorService;

    @Override
    public CreateBookResponse add(CreateBookRequest request) {
        Book book = new Book();
        book.setName(request.getName());
        book.setType(request.getType());
        book.setReleaseDate(request.getReleaseDate());
        book.setAuthor(request.getAuthor());

        bookDao.save(book);

        return CreateBookResponse.builder()
                .name(book.getName())
                .authorName(book.getAuthor().getAuthorName())
                .build();
    }
    @Override
    public String delete(int id) {
        bookDao.deleteById(id);
        return id+" id'li kitap silindi.";
    }
    @Override
    public String update(int id,Book newBook) {
        Book book=bookDao.getReferenceById(id);
        book.setName(newBook.getName());
        book.setAuthor(newBook.getAuthor());
        book.setType(newBook.getType());
        book.setReleaseDate(newBook.getReleaseDate());
        bookDao.save(book);
        return id+"id'li Kitap güncellendi";
    }

//    @Override
//    public Integer addBookWithAuthorId(int id,AuthorManager authorManager) {
//        authorManager.matchBookToAuthor(id);
//        bookDao.getReferenceById(id);
//
//        return null;
//    }


    @Override
    public List<Book> getAll(){
        return bookDao.findAll();
    }
    public Book getById(int id){
        return bookDao.getReferenceById(id);
    }
    @Override
    public Book changeBookAuthor(int bookId,int authorId){
        Author author=authorService.getById(authorId);
        Book book = getById(bookId);
        book.setAuthor(author);
        bookDao.save(book);
        return book;

    }
}
