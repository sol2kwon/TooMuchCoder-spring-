package com.toomuchcoder.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName: com.toomuchcoder.api.common.algorithm
 * fileName        : Gugudan.java
 * author          : solyikwon
 * date            : 2022-05-18
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-18         solyikwon      최초 생성
 **/
public class Gugudan {
    @Builder @Getter @NoArgsConstructor @AllArgsConstructor
    public static class GuSolution{
        private int[][] arr;

        @Override
        public String toString(){
            return String.format("");
        }
    }
    @FunctionalInterface interface Solution{
        void guSolution();
    }
    @Test
    void testSolution(){
        Solution f = () ->{
            for(int k = 2; k < 10; k+=4) {
                for (int i = 1; i < 10; i++) {
                    for (int j = k; j < k+4; j++) {
                        System.out.print(j + "*" + i+ "=" +(j*i)+"\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        };
        f.guSolution();

    }
}
