package com.toomuchcoder.api.board.repositories;

import com.toomuchcoder.api.board.domains.Article;
import com.toomuchcoder.api.board.domains.Board;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * packageName: repositories
 * fileName        : BoardRepository.java
 * author          : solyikwon
 * date            : 2022-05-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-08         solyikwon      최초 생성
 **/

interface BoardCustomRepository{
    // 000. 게시판 이름 boardName 을 변경하시오
    @Query(value="update Board b set b.boardName = :boardName where b.boardId = :boardId",
            nativeQuery = true)
    int update(@Param("boardName") String boardName);
}
public interface BoardRepository extends JpaRepository<Board,Long> {

}
