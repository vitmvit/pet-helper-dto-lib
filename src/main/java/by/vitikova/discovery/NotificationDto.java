package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class NotificationDto {

    private Long id;
    private String userLogin;
    private String name;
    private String description;
    private boolean isActive;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
