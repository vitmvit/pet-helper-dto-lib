package by.vitikova.discovery.update;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserUpdateDateDto {

    private String login;
    private LocalDateTime lastVisit;
}
