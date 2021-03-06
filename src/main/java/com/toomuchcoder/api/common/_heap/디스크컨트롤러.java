package com.toomuchcoder.api.common._heap;

import com.toomuchcoder.api.common._bruteForce.ATM;
import lombok.*;
import org.junit.jupiter.api.Test;

/**
 * packageName: com.toomuchcoder.api.common._heap
 * fileName        : 디스크컨트롤러.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 디스크컨트롤러 {
    @Builder
    @Getter
    @NoArgsConstructor


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
