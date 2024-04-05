package by.vitikova.discovery.auth;

import by.vitikova.discovery.constant.RoleName;

/**
 * DTO объект для входа
 */
public record SignUpCreateDto(
        String login,
        String password,
        String passwordConfirm,
        RoleName role) {
}

