package com.toomuchcoder.api.common._bruteForce;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Random;

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
public class 별찍기 {
    @Data
    @AllArgsConstructor
    static class Solution{


        @Override public String toString(){
            // rectangleStarPrint
            Random random = new Random();
            String res = "";
            int rand = random.nextInt(50);
            System.out.println("좌측90도 직각삼각형 별찍기");
            System.out.println("삼각형의 길이 랜덤으로 생성한 값 : " + rand);
            for (int i = 0; i < rand; i++) {
                for (int j = 0; j <= i; j++) {
                    res += String.format("*");
                }
                res += String.format("\n");
            }
            // triangleStarPrint
            res = "";
            rand = random.nextInt(50);
            System.out.println("정삼각형 별찍기");
            System.out.println("정삼각형의 길이 랜덤으로 생성한 값 : " + rand);
            for (int i = 0; i < rand; i++) {
                for (int j = rand - i; j >= 0; j--) {
                    res += String.format(" ");
                }
                for (int k = 1; k < i * 2; k++) {
                    res += String.format("*");
                }
                res += String.format("\n");
            }
            System.out.print(res);
            return "";
        }
    }
    @FunctionalInterface interface SolutionService {
        Solution solution(Solution s);
    }
    @Test
    void testSolution(){

    }
}

