package com.toomuchcoder.api.board.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName: com.toomuchcoder.api.auth.domains
 * fileName        : Board.java
 * author          : solyikwon
 * date            : 2022-05-18
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-18         solyikwon      최초 생성
 **/
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="boards")

public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue private long boardId;
    @Column private @NotNull
    String boardName;
    @Column(name = "create_date") @NotNull private String create_date;

    @OneToMany(mappedBy = "board")
    List<Article> articles =new ArrayList<>();



}
