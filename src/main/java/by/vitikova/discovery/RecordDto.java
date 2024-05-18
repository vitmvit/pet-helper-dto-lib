package by.vitikova.discovery;

import by.vitikova.discovery.constant.SexName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RecordDto {

    private Long id;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String userLogin;
    private String name;
    private String breed;
    private String animalType;
    private String uuidAvatar;
    private LocalDateTime dataBirthday;
    private String fullName;
    private SexName sex;
    private String description;
    private boolean hasPedigree;
}
