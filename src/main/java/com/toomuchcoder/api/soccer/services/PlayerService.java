package com.toomuchcoder.api.soccer.services;

import com.toomuchcoder.api.soccer.domains.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: soccer.services
 * fileName        : PlayerService.java
 * author          : solyikwon
 * date            : 2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09         solyikwon      최초 생성
 * 2022-05-19      Kwonsolyi    수정
 **/
public interface PlayerService {
    void delete(Player player);

    long count();

    List<Player> findAll(Sort sort);

    void update(Player player);

    void save(Player player);

    Optional<Player> findById(String playerId);

    boolean existsById(String playerId);

    Page<Player> findAll(Pageable pageable);

    List<Player> findAll();
}
