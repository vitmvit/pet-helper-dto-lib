package by.vitikova.discovery.update;

import by.vitikova.discovery.create.StateDictionaryCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventDictionaryUpdateDto extends StateDictionaryCreateDto {

    private Long id;
    private boolean isActive;
}
