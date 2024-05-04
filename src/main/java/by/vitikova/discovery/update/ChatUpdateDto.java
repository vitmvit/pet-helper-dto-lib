package by.vitikova.discovery.update;

import by.vitikova.discovery.constant.ChatStatus;
import by.vitikova.discovery.constant.ChatType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatUpdateDto {

    private Long id;
    private ChatStatus status;
    private ChatType type;
}
