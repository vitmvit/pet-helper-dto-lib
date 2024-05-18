package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NotificationTimeCreateDto {

    private Long notificationId;
    private LocalDateTime time;
    private LocalDateTime date;
    private Long eventId;
    private Long stateId;
}
