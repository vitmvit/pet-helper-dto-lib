package by.vitikova.discovery.update;

import by.vitikova.discovery.create.ArticleCreateDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleUpdateDto extends ArticleCreateDto {

    private Long id;
}
