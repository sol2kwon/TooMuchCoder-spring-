package com.toomuchcoder.api.common._sort;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName: com.toomuchcoder.api.common._sort
 * fileName        : QuickSort.java
 * author          : solyikwon
 * date            : 2022-05-24
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-24         solyikwon      최초 생성
 **/
public class 퀵정렬 {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution{
        private int[] arr;

        public String toString(){return Arrays.toString(arr);}
    }
    @FunctionalInterface
    private interface SolutionService{
        Solution solution(Solution a);
    }
    class Service{
        SolutionService f = e->{
            return Solution.builder().build();
        };
        Solution test(Solution a){
            return f.solution(a);
        }
    }
    @Test
    void testSolution(){
        int[] arr = {15,6,3,4};
        Solution s = Solution.builder().arr(arr).build();
        Service b = new Service();
        System.out.println(b.test(s));


    }

}
