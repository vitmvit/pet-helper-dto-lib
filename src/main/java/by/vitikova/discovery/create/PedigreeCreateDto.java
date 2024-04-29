package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedigreeCreateDto {

    private Long recordId;
    private Long parentExistOneId;
    private Long parentExistTwoId;
    private Long parentNotExistOneId;
    private Long parentNotExistTwoId;
}
