package com.toomuchcoder.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.min;

/**
 * packageName: com.toomuchcoder.api.common.algorithm
 * fileName        : MaxMin.java
 * author          : solyikwon
 * date            : 2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17         solyikwon      최초 생성
 **/
public class MaxMin {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution {
        protected int [] arr;
        private int max, min, elem;

        @Override
        public String toString() {
            return String.format("최소값: %d 최대값 %d",min,max);

            }
        }

        @FunctionalInterface private interface SolutionService {
        Solution solution(Solution s);
        }

        @Test
        void testSolutionTest() {
          int [] arr = {3,1,9,5,10};
            SolutionService f = e -> {
           int max = 0;
           for (int i : e.getArr()){
               if (i>max) max = i ;
           }
           int min = max;
                for (int i :e.getArr()){
                if (i<min) min = i;
            }
            return Solution.builder().max(max).min(min).build();

        };
    Solution s = Solution.builder().arr(arr).build();
    System.out.println(f.solution(s));
    }}

