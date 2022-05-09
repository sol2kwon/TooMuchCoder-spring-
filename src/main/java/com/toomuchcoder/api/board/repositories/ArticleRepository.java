package com.toomuchcoder.api.board.repositories;

import com.toomuchcoder.api.board.domains.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: com.toomuchcoder.api.board.repository
 * fileName        : ArticleRepository.java
 * author          : solyikwon
 * date            : 2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09         solyikwon      최초 생성
 **/
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
