package by.vitikova.discovery.constant;

import lombok.Getter;

@Getter
public enum SexName {
    MALE("MALE"),
    FEMALE("FEMALE"),
    HERM("HERM"),
    UNKNOWN("UNKNOWN");

    private final String sex;

    SexName(String sex) {
        this.sex = sex;
    }
}
