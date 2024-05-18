package by.vitikova.discovery.update;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NotificationTimeUpdateDto {

    private Long id;
    private Long notificationId;
    private LocalDateTime time;
    private LocalDateTime date;
    private Long eventId;
    private Long stateId;
}
