package library.controller;

import library.dto.CreateAuthorRequest;
import library.dto.CreateAuthorResponse;
import library.model.concretes.Author;
import library.services.abstracts.AuthorService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;
    @PostMapping("/add")
    public CreateAuthorResponse addAuthor (@RequestBody CreateAuthorRequest request){
        return authorService.addAuthor(request);
    }
    @DeleteMapping("/delete")
    public String deleteAuthor(@RequestParam("id") int id){
        return authorService.deleteAuthor(id);
    }
    @PutMapping("/update")
    public String updateAuthor(@RequestParam("id") int id,@RequestBody Author newAuthor){
        return authorService.updateAuthor(id, newAuthor);
    }
    @GetMapping("/getall")
    public List<Author> getAllAuthor() {
        return authorService.getAllAuthor();
    }
    @GetMapping("/getById/{id}")
    public Author getById(@PathVariable int id){
        return  authorService.getById(id);
    }

}
