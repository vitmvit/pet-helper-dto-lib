package by.vitikova.discovery.constant;

import lombok.Getter;

@Getter
public enum ChatStatus {

    OPEN("OPEN"),
    FREE("FREE"),
    CLOSED("CLOSED");

    private final String status;

    ChatStatus(String status) {
        this.status = status;
    }
}