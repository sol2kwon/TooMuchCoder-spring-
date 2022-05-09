package com.toomuchcoder.api.board.services;

import com.toomuchcoder.api.board.domains.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.auth.services
 * fileName        : ArticleService.java
 * author          : solyikwon
 * date            : 2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09         solyikwon      최초 생성
 **/
public interface ArticleService {

    List<Article> findAll();

    List<Article> findAll(Sort sort);

    Page<Article> findAll(Pageable pageable);

    long count();

    String delete(Article article);

    String save(Article article);
}
