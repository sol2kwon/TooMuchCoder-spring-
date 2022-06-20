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
    static class Solution {
        private int[] arr;


        public String toString() {
            return null;
        }
    }

    @FunctionalInterface
    private interface SolutionService {
        Solution solution(Solution a);
    }

    @FunctionalInterface
    private interface TriConsumer {
        void accept(int[] arr, int start, int middle, int end);
    }

    @FunctionalInterface
    private interface Tri2Consumer{
        void accept2(int[] arr, int start, int end);
    }



    class Service {
        SolutionService f = e -> {


            return Solution.builder().build();
        };

        Solution test(Solution a) {
            return f.solution(a);
        }
    }

    TriConsumer c = (arr, start, middle, end) -> {
        int[] sorted = new int[arr.length];
        int i = start;
        int j = middle + 1;
        int k = end;
        //작은 순서로 배열에 삽입
        while (i <= middle && j <= end) {
            sorted[k] = arr[j];
            i++;
        }
        if (i>middle){
            for (int t=j; t<=end; t++){
                sorted[k] =arr[t];
                k++;
            }
        } else {
            //정렬된 배열 삽입
            for (int t=i; t<=middle; t++){
                sorted[k] = arr[t];
                k++;
            }
            for (int t = start; t<=middle; t++){
                sorted[k] = arr[t];
                k++;
            }
        }
    };

    Tri2Consumer d = (arr, start, end) -> {
      if(start<end){
          int middle = (start+end)/2;
          //재귀함수 불러와야하는데 람다식 안에서 가능한지 찾아보기.

      }
    };

    @Test
    void testSolution() {
        int[] arr = {29, 1, 10, 54, 11, 3};


        Solution g = Solution.builder().build();
        Service h = new Service();
        System.out.println(h.test(g));
    }
}




