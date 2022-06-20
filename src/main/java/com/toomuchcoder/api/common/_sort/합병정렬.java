package com.toomuchcoder.api.common._sort;

import lombok.*;
import org.junit.jupiter.api.Test;

/**
 * packageName: com.toomuchcoder.api.common._sort
 * fileName        : MergeSort.java
 * author          : solyikwon
 * date            : 2022-05-24
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-24         solyikwon      최초 생성
 **/
public class 합병정렬 {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    static class Solution{
        private int[] arr;


        public String toString(){return null;}
    }

    @FunctionalInterface
    private interface SolutionService{
        Solution solution(Solution a);
    }

    class Service{
        SolutionService f = e ->{
            int [] temp = new int[e.arr.length];
            merge_sort(e.arr,0,e.arr.length-1);
            return Solution.builder().build();
        };


    private void merge_sort(int[] arr, int i, int i1) {
    }

        Solution test(Solution a){return f.solution(a);}
    }

    @Test
    void testSolution(){
        int[] arr ={29,1,10,54,11,3};
        Solution g = Solution.builder().build();
        Service h = new Service();
        System.out.println(h.test(g));
    }


}
