package com.toomuchcoder.api.board.repositories;
import com.toomuchcoder.api.board.domains.Article;
import com.toomuchcoder.api.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
interface ArticleCustomRepository{
    // 000. title 과 content 를 수정하시오
    @Query(value ="update Article a set a.title =: title,a.content =: content where a.articleId =:articleId",
            nativeQuery = true)
    int update(@Param("title") String title, @Param("content")String content);

}
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
