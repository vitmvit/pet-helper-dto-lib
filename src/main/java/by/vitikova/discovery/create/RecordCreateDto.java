package by.vitikova.discovery.create;

import by.vitikova.discovery.constant.SexName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RecordCreateDto {

    private String userLogin;
    private String name;
    private String uuidAvatar;
    private LocalDateTime dataBirthday;
    private String fullName;
    private SexName sex;
    private String description;
}
