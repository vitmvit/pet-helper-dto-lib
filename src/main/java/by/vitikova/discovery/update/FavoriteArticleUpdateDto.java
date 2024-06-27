package by.vitikova.discovery.update;

import by.vitikova.discovery.create.FavoriteArticleCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavoriteArticleUpdateDto extends FavoriteArticleCreateDto {

    private Long id;
}
