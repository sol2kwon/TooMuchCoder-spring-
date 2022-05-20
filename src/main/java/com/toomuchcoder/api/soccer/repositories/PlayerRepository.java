package com.toomuchcoder.api.soccer.repositories;

import com.toomuchcoder.api.soccer.domains.Player;
import com.toomuchcoder.api.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName   :   com.toomuchcoder.api.soccer.repositories
 * fileName      :   PlayerRepository
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 * * 2022-05-19      Kwonsolyi    수정
 */
interface PlayerCustomRepository{
    void update(Player player);
}
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>,PlayerCustomRepository {

}