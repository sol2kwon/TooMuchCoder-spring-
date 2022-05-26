package com.toomuchcoder.api.common._bruteForce;

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
public class 소수찾기 {
    @Builder @Getter @AllArgsConstructor
    static class Solution{
        @Override public String toString(){
            int a;
            a = 0;
            int count = 0;

            for (int i = 2; i <= a; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                if (count == 1) {
                    System.out.print(i + " ");
                }
                count = 0;
            }

            return "";
        }

    }
    @FunctionalInterface static interface SolutionService{ Solution solution(Solution solution);}

    @Test
    void solution(){

    }
    }




