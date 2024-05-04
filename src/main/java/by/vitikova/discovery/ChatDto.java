package by.vitikova.discovery;

import by.vitikova.discovery.constant.ChatStatus;
import by.vitikova.discovery.constant.ChatType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ChatDto {

    private Long id;
    private String supportName;
    private String userName;
    private List<MessageDto> messageList;
    private ChatStatus status;
    private ChatType type;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
