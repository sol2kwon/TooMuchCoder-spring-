package com.toomuchcoder.api.board.repositories;

import com.toomuchcoder.api.board.domains.Article;
import com.toomuchcoder.api.board.domains.Board;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

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
    void update(Board board);
}
public interface BoardRepository extends JpaRepository<Board,Long> {

}
