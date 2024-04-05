package by.vitikova.discovery.auth;

/**
 * DTO объект для входа
 */
public record SignInDto(
        String login,
        String password) {
}
