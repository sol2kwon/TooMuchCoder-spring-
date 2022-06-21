package com.toomuchcoder.api.common._sort;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
   /**
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    static class Solution {
        private int[] arr;

        public String toString() {
            return Arrays.toString(arr);
        }
    }

    @FunctionalInterface
    private interface SolutionService {
        Solution solution(Solution a);
    }

     void merge(int[] arr,int start, int middle, int end){
        int[] sorted = new int[arr.length];
        int i = start;
        int j = middle + 1;
        int k = start;
        //작은 순서로 배열에 삽입
        while (i <= middle && j <= end) {
            if (arr[i] <= arr[j]) {
                sorted[k] = arr[j];
                i++;
            } else {
                sorted[k] = arr[j];
                j++;
            }
            k++;
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
    }

      void mergeSort(int[] arr,int start, int end){
        if(start<end) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr,middle+1,end);
            merge(arr,start,middle,end);
        }
    }

    class Service {
        SolutionService f = e -> {
            mergeSort(e.arr, 0, e.arr.length-1);
            return Solution.builder().arr(e.arr).build();
        };
        Solution test(Solution a) {
            return f.solution(a);
        }
    }

    @Test
    void testSolution() {
        int[] arr = {29, 1, 10, 54, 11, 3};
        Solution g = Solution.builder().arr(arr).build();
        Service h = new Service();
        System.out.println(h.test(g));
    }
    */
  }




