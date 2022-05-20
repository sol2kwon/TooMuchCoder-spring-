package com.toomuchcoder.api.soccer.services;

import com.toomuchcoder.api.soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: soccer.services
 * fileName        : ScheduleService.java
 * author          : solyikwon
 * date            : 2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09         solyikwon      최초 생성
 * 2022-05-19      Kwonsolyi    수정
 **/
public interface ScheduleService {
    List<Schedule> findAll();

    long count();

    void delete(Schedule schedule);

    void update(Schedule schedule);

    void save(Schedule schedule);

    List<Schedule> findAll(Sort sort);

    Optional<Schedule> findById(String s);

    boolean existsById(String s);

    Page<Schedule> findAll(Pageable pageable);
}
