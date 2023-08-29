package org.example.controller;
import org.example.dto.CreateAuthorRequest;
import org.example.dto.CreateAuthorResponse;
import org.example.model.concretes.Author;
import lombok.RequiredArgsConstructor;
import org.example.services.concretes.AuthorManager;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/authors")
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorManager authorService;
    @PostMapping("/add")
    public CreateAuthorResponse addAuthor (@RequestBody CreateAuthorRequest request){
        return authorService.addAuthor(request);
    }
    @DeleteMapping("/delete")
    public String deleteAuthor(@RequestParam("id") String id){
        return authorService.deleteAuthor(id);
    }
    @PutMapping("/update")
    public String updateAuthor(@RequestParam("id") String id,@RequestBody Author newAuthor){
        return authorService.updateAuthor(id, newAuthor);
    }
    @GetMapping("/getall")
    public List<CreateAuthorResponse> getAllAuthor() {
        return authorService.getAllAuthor();
    }
    @GetMapping("/getById/{id}")
    public Author getById(@PathVariable String id){
        return  authorService.getById(id);
    }

}
