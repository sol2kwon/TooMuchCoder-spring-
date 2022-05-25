package com.toomuchcoder.api.auth.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName: com.toomuchcoder.api.security.domain
 * fileName        : Messenger.java
 * author          : solyikwon
 * date            : 2022-05-23
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-23         solyikwon      최초 생성
 **/
//리액트한테 던진다.컴포넌트 필요없음 스프링 몰라야함
@Getter
@Builder
public class Messenger {
    private String message,code;
    private  int status;



}
