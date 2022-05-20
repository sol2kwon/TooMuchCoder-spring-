package com.toomuchcoder.api.soccer.controllers;

import com.toomuchcoder.api.soccer.domains.Schedule;
import com.toomuchcoder.api.soccer.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName   :   com.toomuchcoder.api.soccer.controllers
 * fileName      :   ScheduleController
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 * * 2022-05-19      Kwonsolyi    수정
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleService service;


    @GetMapping("/findAll")
    public List<Schedule> findAll() {
        return service.findAll();
    }
    @GetMapping("/findAll/sort")
    public List<Schedule> findAll(Sort sort) {
        return service.findAll(sort);
    }
    @GetMapping("/findAll/pageable")
    public Page<Schedule> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(Schedule schedule) {
        service.delete(schedule);
        return "";
    }
    @PutMapping("/update")
    public String update(@RequestBody Schedule schedule){
        service.update(schedule);
        return "";
    }

    @PostMapping("/save")
    public String save(@RequestBody Schedule schedule) {
        service.save(schedule);
        return "";
    }
    @GetMapping("/findById/{}")
    public Optional<Schedule> findById(@PathVariable String stadiumId) {
        return service.findById("");
    }

    @GetMapping("/existsById/{}")
    public boolean existsById(@PathVariable String stadiumId) {
        return service.existsById("");
    }
}