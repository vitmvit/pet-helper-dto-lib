package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StateCreateDto {

    private Long dictionaryId;
    private double value;
    private String description;
    private LocalDateTime dateCreated;
}
