package org.example.model.concretes;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonSerialize
@Data

@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String name;
    private String type;
    private String releaseDate;
    private String authorid;
    public Book(){
    }
    public Book(String id, String name, String type, String releaseDate, String authorid) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.releaseDate = releaseDate;
        this.authorid = authorid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return authorid;
    }

    public void setAuthor(String authorid) {
        this.authorid = authorid;
    }
}
