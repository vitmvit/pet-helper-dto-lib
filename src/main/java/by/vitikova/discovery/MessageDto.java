package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MessageDto {

    private Long id;
    private Long chatId;
    private String senderName;
    private String content;
    private LocalDateTime createDate;
}
