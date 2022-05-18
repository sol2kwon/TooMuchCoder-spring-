package com.toomuchcoder.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName: com.toomuchcoder.api.common.algorithm
 * fileName        : Fruits.java
 * author          : solyikwon
 * date            : 2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17         solyikwon      최초 생성
 **/
public class Fruits {
    @Builder @Getter @NoArgsConstructor @AllArgsConstructor
    public static class FruitSolution{
        protected  int arr;
        private int apple,grape,orange,total;

        public String toString(){
            return String.format("토탈: %d 사과: %d 포도: %d 오렌지: %d ",apple,grape,orange,total);
        }

    }
    @FunctionalInterface private interface FruitsSolutionService{
        FruitSolution fruitSolution (FruitSolution fruitSolution);
    }
    @Test
    void testFruitSolution(){

    }

}
