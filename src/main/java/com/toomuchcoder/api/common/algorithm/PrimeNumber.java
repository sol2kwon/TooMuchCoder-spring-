package com.toomuchcoder.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * packageName: com.toomuchcoder.api.common.algorithm
 * fileName        : PrimeNumber.java
 * author          : solyikwon
 * date            : 2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17         solyikwon      최초 생성
 **/
public class PrimeNumber {
    @Getter @Builder @NoArgsConstructor @AllArgsConstructor
    public static class Solution{
        protected int [] primes;
        private int start,end;

        @Override
        public String toString(){
            return null;
        }
    }
    @FunctionalInterface private interface SolutionService{
        String solution(List<Integer> list);
    }
    @Test
    void testSolutionTest(){


    }
    }




