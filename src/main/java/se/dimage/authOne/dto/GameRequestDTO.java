package se.dimage.authOne.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class GameRequestDTO {
    @NotNull(message = "cannot be null")
    @NotBlank(message = "cannot be blank")
    private String title;
    private String genre;
    @DecimalMin(value = "1.0",message = "cannot be lower than 1")
    @DecimalMax(value = "10.0", message = "cannot be above 10")
    private Float rating;
    @Min(value = 1947, message = "no video games before 1947")
    private Integer releaseYear;
}
