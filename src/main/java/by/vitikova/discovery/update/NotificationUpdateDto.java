package by.vitikova.discovery.update;

import by.vitikova.discovery.create.NotificationCreateDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NotificationUpdateDto extends NotificationCreateDto {

    private Long id;
}
