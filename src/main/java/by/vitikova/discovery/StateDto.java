package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StateDto {

    private Long id;
    private Long dictionaryId;
    private double value;
    private String description;
    private LocalDateTime dateCreated;
}
