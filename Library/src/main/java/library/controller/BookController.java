package library.controller;

import library.dto.CreateBookRequest;
import library.dto.CreateBookResponse;
import library.model.concretes.Author;
import library.services.abstracts.BookService;
import library.model.concretes.Book;
import library.services.concretes.AuthorManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/add")
    public CreateBookResponse add (@RequestBody CreateBookRequest request){
        return bookService.add(request);
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") int id){
        return bookService.delete(id);
    }
    @PutMapping("/update")
    public String update(@RequestParam("id") int id,@RequestBody Book newBook){
        return bookService.update(id, newBook);
    }
    @GetMapping("/getall")
    public List<Book> getAll() {
        return bookService.getAll();
    }
//    @GetMapping
//    public Integer addBookWithAuthorId(@RequestParam("id") int id){
//        return bookService.addBookWithAuthorId(id);
//    }

    @PutMapping("/change-book-author")
    public Book changeBookAuthor(@RequestParam("bookId") int bookId ,@RequestParam("authorId")int authorId){
        return bookService.changeBookAuthor(bookId,authorId);


    }
}
