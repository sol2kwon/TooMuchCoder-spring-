package com.toomuchcoder.api.soccer.services;

import com.toomuchcoder.api.soccer.domains.Team;
import com.toomuchcoder.api.soccer.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: soccer.services
 * fileName        : TeamServiceImpl.java
 * author          : solyikwon
 * date            : 2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09         solyikwon      최초 생성
 * 2022-05-19      Kwonsolyi    수정
 **/
@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{
    private final TeamRepository repository;

    @Override
    public void delete(Team team) {
    repository.delete(team);

    }

    @Override
    public List<Team> findAll() {
        return repository.findAll();
    }



    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void save(Team team) {
       repository.save(team);

    }

    @Override
    public Optional<Team> findById(String teamId) {
       return repository.findById(0L);
    }

    @Override
    public boolean existsById(String teamId) {
        return repository.existsById(0L);
    }

    @Override
    public List<Team> findAll(Sort sort) {
         return repository.findAll(sort);
    }

    @Override
    public Page<Team> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void update(Team team) {
         return;

    }
}
