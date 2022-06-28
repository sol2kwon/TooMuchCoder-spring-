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
 * \* 매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다.
 *  * 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.
 *  * 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
 *  * Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
 *  * Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때,
 *  * 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
 *  * | 제한 사항
 *  * scoville의 길이는 2 이상 1,000,000 이하입니다.
 *  * K는 0 이상 1,000,000,000 이하입니다.
 *  * scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
 *  * 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
 *  *
 *  * | 입출력 예
 *  *  scoville                K    return
 *  *  [1, 2, 3, 9, 10, 12]    7      2
 *  *
 *  * | 입출력 예 설명
 *  *
 *  * 스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
 *  * 새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5
 *  * 가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]
 *  *
 *  * 스코빌 지수가 3인 음식과 5인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
 *  * 새로운 음식의 스코빌 지수 = 3 + (5 * 2) = 13
 *  * 가진 음식의 스코빌 지수 = [13, 9, 10, 12]
 *  *
 *  * 모든 음식의 스코빌 지수가 7 이상이 되었고 이때 섞은 횟수는 2회입니다.
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
        private Integer[] scovilleList;
        private int [] a;

        public String toString(){
            return String.format("scoville : %s\nK : %d\nanswer: %d \n 해결해야함: %s:",
                                    Arrays.toString(scoville), k, answer,Arrays.toString(scovilleList));
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
                if (scovilleList.size() == 1) {
                    return Solution.builder()
                            .scoville(e.scoville).scovilleList(e.scovilleList).answer(-1).k(e.getK()).build();
                }
                scovilleList.add( scovilleList.poll() + (scovilleList.poll() * 2));
                answer++;
                System.out.println("4"+ scovilleList+answer);//확인


            }
            System.out.println("5"+ scovilleList+answer);//확인
            return Solution.builder().scoville(e.scoville).scovilleList(e.scovilleList).answer(answer).k(e.k).build();

        };
        Solution test(Solution s){
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

