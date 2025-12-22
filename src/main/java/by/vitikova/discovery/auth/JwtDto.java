package by.vitikova.discovery.auth;

import jakarta.validation.constraints.NotBlank;

public record JwtDto(

        @NotBlank(message = "Access token is required")
        String accessToken) {
}