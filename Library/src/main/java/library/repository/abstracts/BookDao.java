package library.repository.abstracts;
import library.model.concretes.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookDao extends JpaRepository<Book, Integer > {
}
