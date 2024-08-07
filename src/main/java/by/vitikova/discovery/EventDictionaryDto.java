package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EventDictionaryDto {

    private Long id;
    private Long recordId;
    private String name;
    private String uuid;
    private String description;
    private String typeVaccination;
    private boolean isActive;
    private LocalDateTime dateCreated;
}
