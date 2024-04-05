package by.vitikova.discovery.update;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordUpdateDto {

    private String login;
    private String oldPassword;
    private String newPassword;
    private String confirmPassword;
}
