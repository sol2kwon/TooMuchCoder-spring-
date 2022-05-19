package com.toomuchcoder.api.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   :   com.toomuchcoder.api.soccer.domains
 * fileName      :   Player
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 * 2022-05-19      Kwonsolyi    수정
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "players")
public class Player {
    @Id
    @Column(name = "player_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long playerNo;
    @Column(nullable = false) private String playerId;
    @Column(nullable = false) private String playerName;
    private String ePlayerName;
    private String nickname;
    private String joinYyyy;
    private String position;
    private String backNo;
    private String nation;
    private String birthDate;
    private String solar;
    private String height;
    private String weight;
    private String teamId;

    @ManyToOne
    @JoinColumn(name = "team_no")
    private Team team;

}