package by.vitikova.discovery.create;

import by.vitikova.discovery.constant.ArticleStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
public class ArticleCreateDto {

    private String name;
    private String redactorName;
    private String photoUuid;
    private String content;
    private ArticleStatus status;
}
