package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.CreateBookRequest;
import org.example.dto.CreateBookResponse;
import org.example.model.concretes.Book;
import org.example.services.concretes.BookManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
@Slf4j
public class BookController {
    private final BookManager bookService;

    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    @PostMapping("/add")
    public CreateBookResponse add (@RequestBody CreateBookRequest request){
        return bookService.add(request);
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") String id){
        return bookService.delete(id);
    }
    @PutMapping("/update")
    public String update(@RequestParam("id") String id,@RequestBody Book newBook){
        return bookService.update(id, newBook);
    }
    @GetMapping("/getall")
    public List<CreateBookResponse> getAll() {
        return bookService.getAll();
    }
//    @GetMapping
//    public Integer addBookWithAuthorId(@RequestParam("id") int id){
//        return bookService.addBookWithAuthorId(id);
//    }

    @PutMapping("/change-book-author")
    public Book changeBookAuthor(@RequestParam("bookId") String bookId ,@RequestParam("authorId")String authorId){
        return bookService.changeBookAuthor(bookId,authorId);


    }
}
