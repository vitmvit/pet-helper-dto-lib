package by.vitikova.discovery.update;

import by.vitikova.discovery.constant.ChatStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatUpdateDto {

    private Long id;
    private ChatStatus status;
}
