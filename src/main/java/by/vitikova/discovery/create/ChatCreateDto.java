package by.vitikova.discovery.create;

import by.vitikova.discovery.constant.ChatType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatCreateDto {

    private String supportName;
    private String userName;
    private ChatType type;
    private boolean isConstant;
}
