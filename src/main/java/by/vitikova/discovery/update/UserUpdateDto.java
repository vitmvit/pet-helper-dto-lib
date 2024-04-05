package by.vitikova.discovery.update;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserUpdateDto {

    private String login;
    private String password;
}
