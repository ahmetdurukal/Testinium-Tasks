package library.model.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@JsonSerialize
@Entity
@Data

@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "author_last_name")
    private String authorLastName;
    @Column(name = "age")
    private String age;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private List<Book> books;

    public Author(int id, String authorName, String authorLastName, String age, List<Book> books) {
        this.id = id;
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.age = age;
        this.books = books;
    }

    public Author() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
