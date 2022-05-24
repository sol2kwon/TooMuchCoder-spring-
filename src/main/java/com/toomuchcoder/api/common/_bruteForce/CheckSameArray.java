package com.toomuchcoder.api.common._bruteForce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName: com.toomuchcoder.api.common.algorithm
 * fileName        : CheckSameArray.java
 * author          : solyikwon
 * date            : 2022-05-18
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-18         solyikwon      최초 생성
 **/
public class CheckSameArray {
    @Getter @Builder @NoArgsConstructor @AllArgsConstructor
    public static class Solution{
        private String result;

        @Override
        public String toString(){
            return String.format("A 배열과 B 배열 %s",result);
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);

    }
    @Test
    void testSolutionTest(){

    }
}

