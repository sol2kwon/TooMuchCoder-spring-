package com.toomuchcoder.api.soccer.repositories;

import com.toomuchcoder.api.auth.domains.User;

import com.toomuchcoder.api.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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

interface TeamCustomRepository{
    void update(Team Team);
}

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>, TeamCustomRepository {
}