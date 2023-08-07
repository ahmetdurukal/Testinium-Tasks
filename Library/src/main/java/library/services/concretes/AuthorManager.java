package library.services.concretes;
import library.dto.CreateAuthorRequest;
import library.dto.CreateAuthorResponse;
import library.model.concretes.Author;
import library.model.concretes.Book;
import library.repository.abstracts.AuthorDao;
import library.services.abstracts.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorManager implements AuthorService {
    private final AuthorDao authorDao;
    @Override
    public CreateAuthorResponse addAuthor(CreateAuthorRequest request){
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
    @Override
    public String deleteAuthor(int id) {
        authorDao.deleteById(id);
        return id+" id'li yazar silindi.";
    }
    @Override
    public String updateAuthor(int id,Author newAuthor) {
        Author author = getById(id);
        author.setAuthorName(newAuthor.getAuthorName());
        author.setAuthorLastName(newAuthor.getAuthorLastName());
        author.setAge(newAuthor.getAge());
        authorDao.save(author);
        return id+"id'li yazar güncellendi";
    }
    @Override
    public Author getById(int id) {
       return authorDao.getReferenceById(id);
    }
    @Override
    public List<Author> getAllAuthor() {
        return authorDao.findAll();
    }
//    @Override
//    public String matchBookToAuthor(int id){
//        authorDao.findById(id);
//        return  matchBookToAuthor(id);
//    }



}
