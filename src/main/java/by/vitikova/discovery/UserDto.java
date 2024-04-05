package by.vitikova.discovery;

import by.vitikova.discovery.constant.RoleName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDto {

    private String id;
    private String login;
    private String password;
    private RoleName role;
    private LocalDateTime createDate;
    private LocalDateTime lastVisit;
}
