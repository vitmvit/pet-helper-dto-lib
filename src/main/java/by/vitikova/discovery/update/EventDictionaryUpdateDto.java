package by.vitikova.discovery.update;

import by.vitikova.discovery.create.EventDictionaryCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventDictionaryUpdateDto extends EventDictionaryCreateDto {
    //todo
    private Long id;
    private boolean isActive;
}
