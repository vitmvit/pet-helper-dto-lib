package by.vitikova.discovery.constant;

import lombok.Getter;

@Getter
public enum ArticleStatus {

    FINISHED("FINISHED"),
    DRAFT("DRAFT");

    private final String status;

    ArticleStatus(String status) {
        this.status = status;
    }
}
