package com.toomuchcoder.api.common._sort;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


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
        private int temp;

        public String toString(){return Arrays.toString(arr);}
    }

    @FunctionalInterface
    private interface SolutionService {
        Solution solution(Solution s);
    }

    class Service{
        SolutionService f = e ->{
            for(int i = 1; i<e.arr.length;i++){
                int target = e.arr[i];
                int j = i - 1;

                while (j >= 0 && target < e.arr[j]){
                    e.arr[j+1] = e.arr[j];
                    j--;
                }
                e.arr[j+1] = target;
            }

            return Solution.builder().arr(e.arr).build();
        };

        Solution test(Solution s){
            return f.solution(s);
        }
    }

    @Test
    void testSolution(){
        int[] arr = {39,2,5};
        Solution s = Solution.builder().arr(arr).build();
        Service s2 = new Service();
        System.out.println(s2.test(s));

    }
}
