package by.vitikova.discovery.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavoriteArticleCreateDto {

    private String userLogin;
    private Long articleId;
}
