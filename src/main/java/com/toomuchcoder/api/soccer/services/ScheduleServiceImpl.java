package com.toomuchcoder.api.soccer.services;

import com.toomuchcoder.api.soccer.domains.Schedule;
import com.toomuchcoder.api.soccer.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: soccer.services
 * fileName        : ScheduleServiceImpl.java
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
public class ScheduleServiceImpl implements ScheduleService{
    private final ScheduleRepository repository;

    @Override
    public List<Schedule> findAll() {
        return repository.findAll();
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void delete(Schedule schedule) {
        repository.delete(schedule);

    }

    @Override
    public void update(Schedule schedule) {
        return;

    }

    @Override
    public void save(Schedule schedule) {
        repository.save(schedule);

    }

    @Override
    public List<Schedule> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Optional<Schedule> findById(String s) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String s) {
        return repository.existsById(0L);
    }

    @Override
    public Page<Schedule> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
