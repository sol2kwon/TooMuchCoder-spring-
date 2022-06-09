package com.toomuchcoder.api.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName   :   com.toomuchcoder.api.soccer.domains
 * fileName      :   Stadium
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 *  * 2022-05-19      Kwonsolyi    수정
 */
@Getter @AllArgsConstructor @NoArgsConstructor
@Component
@Entity
@Table(name = "stadiums")
public class Stadium {
    @Id
    @Column(name = "stadium_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long stadiumNo;
    @Column(nullable = false) private String stadiumId;
    private String stadiumName;
    private String hometeamId;
    private String seatCount;
    private String address;
    private String ddd;
    private String tel;

    @OneToMany(mappedBy = "stadium")
    List<Schedule> schedules = new ArrayList<>();
}