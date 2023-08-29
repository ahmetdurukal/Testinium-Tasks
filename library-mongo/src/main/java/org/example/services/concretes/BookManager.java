package org.example.services.concretes;
import lombok.RequiredArgsConstructor;
import org.example.dto.CreateBookRequest;
import org.example.dto.CreateBookResponse;
import org.example.model.concretes.Author;
import org.example.model.concretes.Book;
import org.example.repository.abstracts.AuthorDao;
import org.example.repository.abstracts.BookDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookManager {
    private final BookDao bookDao;
    private final AuthorDao authorDao;


    public CreateBookResponse add(CreateBookRequest request) {
        Book book = new Book();
        book.setName(request.getName());
        book.setType(request.getType());
        book.setReleaseDate(request.getReleaseDate());
        book.setAuthorid(request.getAuthorid());

        bookDao.save(book);

        Author author = authorDao.findById(request.getAuthorid()).get();
        author.getBooksid().add(book.getId());
        authorDao.save(author);
        return CreateBookResponse.builder()
                .name(book.getName())
                .authorName(author.getAuthorName())
                .build();
    }

    public String delete(String id) {
        bookDao.deleteById(id);
        return id+" id'li kitap silindi.";
    }

    public String update(String id,Book newBook) {
        Book book=bookDao.findById(id).get();
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

    public List<CreateBookResponse> getAll(){
        return bookDao.findAll().stream().map(book -> {
            CreateBookResponse dto = new CreateBookResponse();
            dto.setName(book.getName());
            dto.setAuthorName(book.getAuthor());
            return dto;
        }).collect(Collectors.toList());
    }
    public Book getById(String id){
        return bookDao.findById(id).get();
    }

    public Book changeBookAuthor(String bookId,String authorId){
        Book book = getById(bookId);
        book.setAuthor(authorId);
        bookDao.save(book);
        return book;

    }
}
