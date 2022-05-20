package com.toomuchcoder.api.soccer.repositories;

import com.toomuchcoder.api.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * packageName   :   com.toomuchcoder.api.soccer.repositories
 * fileName      :   Stadium
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 * * 2022-05-19      Kwonsolyi    수정
 */
interface StadiumCustomRepository{
    void update(Stadium stadium);
    // 스타디움 전화번호 tel 을 변경하도록 하시오
    @Query(value = "update stardium s set s.tel where s.stadiumNo = :stadiumNo",
            nativeQuery = true)
    int update(@Param("tel") String tel);

}
@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long> {

}