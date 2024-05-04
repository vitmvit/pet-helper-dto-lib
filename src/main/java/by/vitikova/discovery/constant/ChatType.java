package by.vitikova.discovery.constant;

import lombok.Getter;

@Getter
public enum ChatType {

    SUPPORT("SUPPORT"),
    MEDICAL("MEDICAL");

    private final String type;

    ChatType(String type) {
        this.type = type;
    }
}
