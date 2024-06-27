package by.vitikova.discovery.update;

import by.vitikova.discovery.create.TagCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TagUpdateDto extends TagCreateDto {

    private Long id;
}
