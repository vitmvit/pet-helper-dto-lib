package by.vitikova.discovery.update;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordUpdateDto {

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String login;

    @NotBlank(message = "Current password is required")
    private String oldPassword;

    @NotBlank(message = "New password is required")
    @Size(min = 6, message = "New password must be at least 6 characters long")
    private String newPassword;

    @NotBlank(message = "Password confirmation is required")
    private String confirmPassword;
}