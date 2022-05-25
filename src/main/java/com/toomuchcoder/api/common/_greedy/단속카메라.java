package com.toomuchcoder.api.common._greedy;

import com.toomuchcoder.api.common._bruteForce.ATM;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName: com.toomuchcoder.api.common._greedy
 * fileName        : 단속카메라.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 단속카메라 {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution{


        public String toString(){
            return String.format(" ");
        }

    }
    @FunctionalInterface private interface ISolution{
        ATM.Solution solution (ATM.Solution s);
    }
    @Test
    void testSolution(){

    }
}
