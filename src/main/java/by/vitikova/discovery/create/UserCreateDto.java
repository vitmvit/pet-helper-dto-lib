package by.vitikova.discovery.create;

import by.vitikova.discovery.constant.RoleName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateDto {

//    @NotBlank
//    @Email
    private String login;

    private String password;
    private String passwordConfirm;
    private RoleName role;
}
