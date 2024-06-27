package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StateDictionaryDto {

    private Long id;
    private Long recordId;
    private String name;
    private String uuid;
    private String description;
    private boolean isActive;
    private LocalDateTime dateCreated;
}
