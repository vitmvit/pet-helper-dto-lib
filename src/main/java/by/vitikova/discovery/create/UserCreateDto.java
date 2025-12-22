package by.vitikova.discovery.create;

import by.vitikova.discovery.constant.RoleName;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateDto {

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String login;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    @NotBlank(message = "Password confirmation is required")
    private String passwordConfirm;

    @NotNull(message = "Role is required")
    private RoleName role;
}