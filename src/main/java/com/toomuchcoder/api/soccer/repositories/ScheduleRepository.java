package com.toomuchcoder.api.soccer.repositories;

import com.toomuchcoder.api.soccer.domains.Schedule;
import com.toomuchcoder.api.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * packageName   :   com.toomuchcoder.api.soccer.repositories
 * fileName      :   ScheduleRepository
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 * * 2022-05-19      Kwonsolyi    수정
 */
interface ScheduleCustomRepository{
    void update(Schedule schedule);
    // 스케줄 날짜만 수정이 되도록 하시오
    @Query(value = "update schedule sch set sch.scheDate where sch.scheduleNo = :scheduleNo",
            nativeQuery = true)
    int update(@Param("scheDate") String scheDate);

}
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}