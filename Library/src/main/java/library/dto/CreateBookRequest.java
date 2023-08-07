package library.dto;

import library.model.concretes.Author;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookRequest {
    private String name;
    private String type;
    private String releaseDate;
    private Author author;
}
