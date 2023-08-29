package org.example.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateAuthorRequest {
    private String id;
    private String authorName;
    private String authorLastName;
    private String age;
}
