package by.vitikova.discovery.update;

import by.vitikova.discovery.create.VaccinationTypeCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VaccinationTypeUpdateDto extends VaccinationTypeCreateDto {

    private Long id;
}
