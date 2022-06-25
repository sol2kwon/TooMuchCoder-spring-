package com.toomuchcoder.api.common._heap;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

import static java.lang.String.valueOf;

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
        private int[] scoville;
        private int k;
        private int answer;
        private int[] scovilleList;

        public String toString(){
            return null;//출력 어떻게 할까요..
        }
    }
    @FunctionalInterface
    private interface SolutionService{
        Solution solution (Solution s);
    }

    class Service {
        SolutionService f = e -> {
            int answer = 0;
            PriorityQueue<Integer> scovilleList = new PriorityQueue<>();
            System.out.println("1"+ scovilleList+answer);//확인
            for (int i = 0; i < e.scoville.length; i++) {
                scovilleList.add(e.scoville[i]);
                System.out.println("2"+ scovilleList+answer);//확인
            }
            System.out.println("3"+ scovilleList+answer);//확인

            while (scovilleList.peek() < e.k) {
                if (scovilleList.size() == 1)
                    return Solution.builder().answer(-1).build();
                scovilleList.add(scovilleList.poll() + scovilleList.poll() * 2);
                answer++;
            }
            System.out.println("4"+ scovilleList+answer);//확인
            return Solution.builder().scovilleList(e.scovilleList).answer(e.answer).build();
        };
        Solution test(Solution s) {
            return f.solution(s);
        }
    }
        @Test
        void testSolution() {
            int[] scoville = {1, 2, 3, 9, 10, 12};
            int k = 7;
            Service s2 = new Service();
            Solution s = Solution.builder().scoville(scoville).k(k).build();
            System.out.println(s2.test(s));

        }
}

