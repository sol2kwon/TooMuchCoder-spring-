package com.toomuchcoder.api.soccer.services;

import com.toomuchcoder.api.soccer.domains.Stadium;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: soccer.services
 * fileName        : StadiumService.java
 * author          : solyikwon
 * date            : 2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09         solyikwon      최초 생성
 * 2022-05-19      Kwonsolyi    수정
 **/
public interface StadiumService {
    void delete(Stadium stadium);

    void update(Stadium stadium);

    void save(Stadium stadium);

    List<Stadium> findAll();

    long count();

    Optional<Stadium> findById(String stadiumId);

    boolean existsById(String stadiumId);

    List<Stadium> findAll(Sort sort);

    Page<Stadium> findAll(Pageable pageable);
}
