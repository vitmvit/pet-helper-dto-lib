package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BreedCreateDto {

    private Long id;
    private String name;
    private Long typeId;
}
