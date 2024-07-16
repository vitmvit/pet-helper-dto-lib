package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EventCreateDto {

    private Long dictionaryId;
    private String textColor;
    private String description;
    private LocalDateTime dateCreated;
}
