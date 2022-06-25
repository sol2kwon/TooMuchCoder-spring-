package com.toomuchcoder.api.common._heap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * packageName: com.toomuchcoder.api.common._heap
 * fileName        : 더맵게.java
 * author          : solyikwon
 * date            : 2022-06-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-25         solyikwon      최초 생성
 **/
public class 더맵게 {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor

    public static class Solution{
        private int [] scoville;
        private int k;
        private int answer;
        private Integer[] scovilleList;


        public String toString(){
            return Arrays.toString(scovilleList);
        }

    }
    @FunctionalInterface
    private interface SolutionService{
        Solution solution (Solution s);
    }

    class Service {
        SolutionService f = e -> {
            PriorityQueue<Integer> scovilleList = new PriorityQueue<Integer>();
            for (int i = 0; i < e.scoville.length; i++) {
                scovilleList.offer(e.scoville[i]);
            }
            int answer = 0;
            while (scovilleList.size() > 1 && scovilleList.peek() < e.k) {
                int min1 = scovilleList.poll();
                int min2 = scovilleList.poll();

                int mix = min1 + (min2 * 2);
                scovilleList.offer(mix);
                 e.answer = answer++;
                return Solution.builder().answer(e.answer).build();
            }
            if (scovilleList.size() <= 1 && scovilleList.peek() < e.k) {
                 e.answer = answer = -1;
                return Solution.builder().answer(e.answer).build();

            }
            return Solution.builder().scovilleList(e.scovilleList).build();

        };

        Solution test(Solution s) {
            return f.solution(s);
        }
    }

        @Test
        void testSolution(){
            int [] scoville = {1, 2, 3, 9, 10, 12};
            int k = 7;
            Service s2 = new Service();
            Solution s = Solution.builder().scoville(scoville).k(k).build();
            System.out.println(s2.test(s));

        }
    }

