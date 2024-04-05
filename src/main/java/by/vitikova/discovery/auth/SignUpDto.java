package by.vitikova.discovery.auth;

import by.vitikova.discovery.constant.RoleName;

/**
 * DTO объект для регистрации
 */
public record SignUpDto(
        String login,
        String password,
        RoleName role) {
}
