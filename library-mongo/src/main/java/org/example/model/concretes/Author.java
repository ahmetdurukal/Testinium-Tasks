package org.example.model.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@JsonSerialize

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "author")
public class Author {

    @Id
    private String id;
    private String authorName;
    private String authorLastName;
    private String age;
    private List<String> booksid = new ArrayList<String>();
}
