package by.vitikova.discovery.update;

import by.vitikova.discovery.create.NotExistParentCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotExistParentUpdateDto extends NotExistParentCreateDto {

    private Long id;
}