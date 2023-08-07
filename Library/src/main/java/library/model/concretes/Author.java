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
@NoArgsConstructor
@AllArgsConstructor
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
}
