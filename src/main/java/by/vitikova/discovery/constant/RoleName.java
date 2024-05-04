package by.vitikova.discovery.constant;

import lombok.Getter;

import java.util.stream.Stream;

/**
 * Enum ролей пользователей
 */

@Getter
public enum RoleName {
    ADMIN("ADMIN"),
    SUPPORT("SUPPORT"),
    VET("VET"),
    USER("USER");

    private final String role;

    RoleName(String role) {
        this.role = role;
    }

    public static RoleName getRoleName(String roleString) {
        return Stream.of(RoleName.values())
                .filter(role -> roleString.equals(role.getRole()))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
