package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NotificationTimeCreateDto {
    //todo
    private Long notificationId;
    private LocalDateTime time;
    private LocalDateTime date;
    private Long recordId;
    private Long eventId;
    private Long stateId;
}
