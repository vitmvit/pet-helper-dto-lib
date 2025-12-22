package by.vitikova.discovery.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record SignInDto(

        @NotBlank(message = "Email is required")
        @Email(message = "Email should be valid")
        String login,

        @NotBlank(message = "Password is required")
        String password) {
}