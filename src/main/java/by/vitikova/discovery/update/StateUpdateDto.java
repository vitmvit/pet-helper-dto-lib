package by.vitikova.discovery.update;

import by.vitikova.discovery.create.StateCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateUpdateDto extends StateCreateDto {

    private Long id;
}
