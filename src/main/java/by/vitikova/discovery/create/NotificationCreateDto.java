package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NotificationCreateDto {

    private Long recordId;
    private String name;
    private String description;
    private boolean isActive;
}
