package com.toomuchcoder.api.soccer.services;

import com.toomuchcoder.api.soccer.domains.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: soccer.services
 * fileName        : TeamService.java
 * author          : solyikwon
 * date            : 2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09         solyikwon      최초 생성
 * 2022-05-19      Kwonsolyi    수정
 **/
public interface TeamService {


    void delete(Team team);

    List<Team> findAll();

    long count();

   

    void save(Team team);

    Optional<Team> findById(String teamId);

    boolean existsById(String teamId);

    List<Team> findAll(Sort sort);

    Page<Team> findAll(Pageable pageable);

    void update(Team team);
}
