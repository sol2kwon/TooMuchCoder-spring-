package com.toomuchcoder.api.common.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

/**
 * packageName: com.toomuchcoder.api.common.enums
 * fileName        : Rps.java
 * author          : solyikwon
 * date            : 2022-05-13
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-13         solyikwon      최초 생성
 **/
public class Rps {
    @RequiredArgsConstructor
    //
    // 파라미터 : a,b,c,f
//    @NoArgsConstructor
        // 파라미터 : 없음
//    @AllArgsConstructor
        // 파라미터 : a,b,c,d,f
    enum Rps1{
//        ROUND1(->(int)(Math.random()*3)+1);
        ;
        private final int a,b;
        @NonNull
        private int c;
        private int d;
        private final BiFunction<Integer,Integer,Integer> f;

    // 생성자(Constructor) 는 메소드다.
    // 리턴 타입이 없고, 메소드명이 클래스 명과 동일하다.
    // 생성자는 필드값을 초기화 한다.

        @Override
        public String toString() {return null;}
        public int apply(int a, int b){return f.apply(a,b);}
    }

    @Test
    void rpsTest(){

    }
    //수정하기 다시 내용정리

}
