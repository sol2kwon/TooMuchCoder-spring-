package com.toomuchcoder.api.common._hash;

import com.toomuchcoder.api.common._greedy.구명보트;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName: com.toomuchcoder.api.common._hash
 * fileName        : 위장.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 위장 {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution{


        public String toString(){
            return String.format(" ");
        }

    }
    @FunctionalInterface private interface ISolution{
        구명보트.Solution solution (구명보트.Solution s);
    }
    @Test
    void testSolution(){

    }
}
