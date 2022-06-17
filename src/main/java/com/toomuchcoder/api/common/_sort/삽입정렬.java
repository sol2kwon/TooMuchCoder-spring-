package com.toomuchcoder.api.common._sort;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * packageName: com.toomuchcoder.api.common._sort
 * fileName        : InsertionSort.java
 * author          : solyikwon
 * date            : 2022-05-24
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-24         solyikwon      최초 생성
 **/
public class 삽입정렬 {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    static class Solution{
        private int[] arr;

        public String toString(){return null;}
    }

    @FunctionalInterface
    private interface SolutionService {
        Solution solution(Solution s);
    }

    class Service{
        SolutionService f = e ->{
            for(int i = 1; i<e.arr.length;i++){
                for (int j = i-1; j< e.arr.length-i; j++){

                }
            }

            return null;};

        Solution test(Solution a){
            return f.solution(a);
        }
    }
    @Test
    void testSolution(){
        int[] arr = {1,3,11,2};
        Solution c = Solution.builder().arr(arr).build();
        Service b = new Service();
        System.out.println(b.test(c));

    }
}
