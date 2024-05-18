package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EventDto {

    private Long id;
    private Long dictionaryId;
    private String textColor;
    private String description;
    private LocalDateTime dateCreated;
}
