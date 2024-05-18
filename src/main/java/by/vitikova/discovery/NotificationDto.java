package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NotificationDto {

    private Long id;
    private Long recordId;
    private String name;
    private String description;
    private boolean isActive;
}
