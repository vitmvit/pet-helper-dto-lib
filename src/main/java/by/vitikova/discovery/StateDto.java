package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StateDto {
    //todo
    private Long id;
    private Long dictionaryId;
    private double value;
    private String description;
    private LocalDateTime dateCreated;
}
