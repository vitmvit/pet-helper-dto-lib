package by.vitikova.discovery.update;

import by.vitikova.discovery.create.AnimalTypeCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalTypeUpdateDto extends AnimalTypeCreateDto {
    //todo
    private Long id;
}
