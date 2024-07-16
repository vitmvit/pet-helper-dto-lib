package by.vitikova.discovery.update;

import by.vitikova.discovery.create.PedigreeCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedigreeUpdateDto extends PedigreeCreateDto {

    private Long id;
}
