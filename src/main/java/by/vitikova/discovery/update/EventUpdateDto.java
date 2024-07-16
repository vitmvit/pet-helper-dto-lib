package by.vitikova.discovery.update;

import by.vitikova.discovery.create.EventCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventUpdateDto extends EventCreateDto {

    private Long id;
}
