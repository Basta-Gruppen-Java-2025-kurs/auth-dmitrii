package se.dimage.authOne.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameResponseDTO {
    private Long id;
    private String title;
    private String genre;
    private Float rating;
    private Integer releaseYear;
}
