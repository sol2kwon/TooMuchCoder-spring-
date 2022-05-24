package com.toomuchcoder.api.board.domains;

import com.sun.istack.NotNull;
import com.toomuchcoder.api.user.domains.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: com.toomuchcoder.api.auth.domains
 * fileName        : Article.java
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
@Table(name="articles")
public class Article {
    @Id
    @Column(name = "article_id")
    @GeneratedValue private long articleId;
    @Column @NotNull private String title;
    @Column @NotNull private String content;
    @Column(name = "written_date") @NotNull private String writtenDate;

    @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
        @JoinColumn (name = "board_id")
    Board board;




}
