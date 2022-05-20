package com.toomuchcoder.api.soccer.services;

import com.toomuchcoder.api.soccer.domains.Stadium;
import com.toomuchcoder.api.soccer.repositories.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: soccer.services
 * fileName        : StadiumServiceImpl.java
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
public class StadiumServiceImpl implements StadiumService{
    private final StadiumRepository repository;

    @Override
    public void delete(Stadium stadium) {
      repository.delete(stadium);


    }

    @Override
    public void update(Stadium stadium) {
       return;


    }

    @Override
    public void save(Stadium stadium) {
        repository.save(stadium);

    }

    @Override
    public List<Stadium> findAll() {
        return repository.findAll();
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public Optional<Stadium> findById(String stadiumId) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String stadiumId) {
        return repository.existsById(0L);
    }

    @Override
    public List<Stadium> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Stadium> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
