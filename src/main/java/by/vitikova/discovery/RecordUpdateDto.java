package by.vitikova.discovery;

import by.vitikova.discovery.create.RecordCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecordUpdateDto extends RecordCreateDto {

    private Long id;
    private boolean hasPedigree;
}
