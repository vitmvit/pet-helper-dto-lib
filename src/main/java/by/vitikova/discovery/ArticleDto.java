package by.vitikova.discovery;

import by.vitikova.discovery.constant.ArticleStatus;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.time.LocalDateTime;

@Getter
@Setter
public class ArticleDto {

    private Long id;
    private String name;
    private String redactorName;
    private String photoUuid;
    private String content;
    private ArticleStatus status;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
