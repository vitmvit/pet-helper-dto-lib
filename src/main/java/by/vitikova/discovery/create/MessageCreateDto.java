package by.vitikova.discovery.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageCreateDto {

    @NotNull(message = "ID чата обязателен")
    private Long chatId;

    @NotBlank(message = "Имя отправителя не может быть пустым")
    private String senderName;

    @NotBlank(message = "Сообщение не может быть пустым")
    @Size(max = 2000, message = "Сообщение слишком длинное")
    private String content;

    private String uuidPhoto;
}