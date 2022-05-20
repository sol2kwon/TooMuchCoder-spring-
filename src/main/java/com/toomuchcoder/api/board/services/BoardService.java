package com.toomuchcoder.api.board.services;

import com.toomuchcoder.api.board.domains.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: services
 * fileName        : BoardService.java
 * author          : solyikwon
 * date            : 2022-05-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-08         solyikwon      최초 생성
 **/
public interface BoardService {
    List<Board> findAll();

    long count();

    String delete(Board board);

    String save(Board board);

    List<Board> findAll(Sort sort);

    Page<Board> findAll(Pageable pageable);

    void update(Board board);
}
