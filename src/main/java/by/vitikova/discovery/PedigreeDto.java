package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedigreeDto {

    private Long id;
    private Long recordId;
    private Long parentExistOneId;
    private Long parentExistTwoId;
    private Long parentNotExistOneId;
    private Long parentNotExistTwoId;
}
