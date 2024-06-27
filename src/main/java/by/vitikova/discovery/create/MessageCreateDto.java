package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageCreateDto {

    private Long chatId;
    private String senderName;
    private String content;
    private String uuidPhoto;
}
