package com.toomuchcoder.api.board.services;

import com.toomuchcoder.api.board.domains.Board;
import com.toomuchcoder.api.board.repositories.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * packageName: services
 * fileName        : BoardServiceImpl.java
 * author          : solyikwon
 * date            : 2022-05-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-08         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository repository;


    @Override
    public List<Board> findAll() {
        return repository.findAll();
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Board board) {
        repository.delete(board);
        return "";

    }

    @Override
    public String save(Board board) {
         repository.save(board);
         return "";
    }

    @Override
    public List<Board> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Board> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void update(Board board) {
        return;
    }
}
