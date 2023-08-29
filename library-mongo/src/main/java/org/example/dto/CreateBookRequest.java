package org.example.dto;

import org.example.model.concretes.Author;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookRequest {
    private String name;
    private String type;
    private String releaseDate;
    private String authorid;
}
