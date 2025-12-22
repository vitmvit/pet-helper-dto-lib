package by.vitikova.discovery.create;

import by.vitikova.discovery.constant.ChatType;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatCreateDto {

    private String supportName;

    @NotBlank(message = "Имя пользователя обязательно")
    private String userName;

    private ChatType type;
    private boolean isConstant;
}