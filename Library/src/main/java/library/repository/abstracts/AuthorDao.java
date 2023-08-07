package library.repository.abstracts;

import library.model.concretes.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author,Integer> {
}
