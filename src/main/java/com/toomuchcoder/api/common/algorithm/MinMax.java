package com.toomuchcoder.api.common.algorithm;

import com.toomuchcoder.api.common._stackQueue.기능개발;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinMax {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor

    public static class Solution{
        private int [] arr;
        private int answer;
        private int max, min;

        public String toString(){
            return String.format("");
        }

    }
    @FunctionalInterface private interface SolutionService{
        Solution solution (Solution s);
    }

    class Service{
        SolutionService f = e ->{
            int max = 0;
            for (int i:e.getArr()){

            }



            return Solution.builder().build();
        };
        Solution test(Solution s){
            return f.solution(s);
        }
    }

    @Test
    void testSolution(){
        int [] arr = {5,9,2,13};

        Service s1 = new Service();
        Solution s = Solution.builder().build();
        System.out.println(s1.test(s));
    }
}




