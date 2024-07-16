package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateDictionaryCreateDto {

    private Long recordId;
    private String name;
    private String description;
    private String uuid;
}
