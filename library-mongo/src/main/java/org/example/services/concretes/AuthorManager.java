package org.example.services.concretes;

import lombok.RequiredArgsConstructor;
import org.example.dto.CreateAuthorRequest;
import org.example.dto.CreateAuthorResponse;
import org.example.model.concretes.Author;
import org.example.repository.abstracts.AuthorDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorManager {
    private final AuthorDao authorDao;


    public CreateAuthorResponse addAuthor(CreateAuthorRequest request) {
        Author author = new Author();
        author.setAuthorName(request.getAuthorName());
        author.setAuthorLastName(request.getAuthorLastName());
        author.setAge(request.getAge());

        authorDao.save(author);

        return CreateAuthorResponse.builder()
                .authorName(author.getAuthorName())
                .authorLastName(author.getAuthorLastName())
                .build();
    }


    public String deleteAuthor(String id) {
        authorDao.deleteById(id);
        return id + " id'li yazar silindi.";
    }


    public String updateAuthor(String id, Author newAuthor) {
        Author author = getById(id);
        author.setAuthorName(newAuthor.getAuthorName());
        author.setAuthorLastName(newAuthor.getAuthorLastName());
        author.setAge(newAuthor.getAge());
        authorDao.save(author);
        return id + "id'li yazar güncellendi";
    }


    public Author getById(String id) {
        return authorDao.findById(id).get();
    }


    public List<CreateAuthorResponse> getAllAuthor() {
        return authorDao.findAll().stream().map(author -> {
            CreateAuthorResponse dto = new CreateAuthorResponse();
            dto.setAuthorName(author.getAuthorName());
            dto.setAuthorLastName(author.getAuthorLastName());
            return dto;
        }).collect(Collectors.toList());
    }
//    @Override
//    public String matchBookToAuthor(int id){
//        authorDao.findById(id);
//        return  matchBookToAuthor(id);
//    }
}
