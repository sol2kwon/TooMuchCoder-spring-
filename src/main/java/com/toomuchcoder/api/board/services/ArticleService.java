package com.toomuchcoder.api.board.services;


import com.toomuchcoder.api.board.domains.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

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

    long count();

    String delete(Article article);

    String save(Article article);

    List<Article> findAll(Sort sort);

    Page<Article> findAll(Pageable pageable);

    void update(Article article);
}
