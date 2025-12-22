package by.vitikova.discovery.auth;

import by.vitikova.discovery.constant.RoleName;

//todo
public record SignUpDto(
        String login,
        String password,
        RoleName role) {
}
