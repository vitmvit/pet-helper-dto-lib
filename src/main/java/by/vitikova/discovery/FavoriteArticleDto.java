package by.vitikova.discovery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavoriteArticleDto {

    private Long id;
    private String userLogin;
    private Long articleId;
}
