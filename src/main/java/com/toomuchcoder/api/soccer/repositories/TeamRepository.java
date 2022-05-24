package com.toomuchcoder.api.soccer.repositories;

import com.toomuchcoder.api.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * packageName   :   com.toomuchcoder.api.soccer.repositories
 * fileName      :   TeamRepository
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 * * 2022-05-19      Kwonsolyi    수정
 */

interface TeamCustomRepository {
    // 000. 팀의 전화번호와 팩스번호를 수정하시오
    @Query(value="update Team t set t.tel = :tel, t.fax = :fax where t.teamNo = :teamNo",
            nativeQuery = true)
    int update(@Param("tel") String tel, @Param("fax") String fax);

    // 001. 전체 축구팀 목록을 팀이름 오름차순으로 출력하시오
    @Query(value="select t.teamName as teamName from Team t order by t.teamName",
            nativeQuery = true)
    List<String> findTeamNamesAsc();

    // 005-2. 수원팀의 ID는 ?
    @Query(value ="select t.teamId from Team t where t.regionName like 수원",
            nativeQuery = true) Optional<Team> findById(String teamId);
}
    @Repository
public interface TeamRepository extends JpaRepository<Team,Long>{
    }
