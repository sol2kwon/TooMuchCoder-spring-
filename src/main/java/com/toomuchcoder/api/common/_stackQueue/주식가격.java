package com.toomuchcoder.api.common._stackQueue;

import com.toomuchcoder.api.common._bruteForce.ATM;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName: com.toomuchcoder.api.common._stackQueue
 * fileName        : 주식가격.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
 * 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 * 제한사항
 * prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
 * prices의 길이는 2 이상 100,000 이하입니다.
 * 입출력 예
 *     prices	             return
 * [1, 2, 3, 2, 3]	     [4, 3, 1, 1, 0]
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 주식가격 {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor

    public static class Solution{
        private int[] prices;
        private int[] answer;


        public String toString(){
            return String.format("답: %s ", Arrays.toString(answer));
        }

    }
    @FunctionalInterface private interface SolutionService{
        Solution solution (Solution s);
    }

    class Service{
        SolutionService f = e ->{
            int[] answer = new int[e.prices.length];
            for (int i = 0; i< e.prices.length; i++){
                for (int j = i+1; j < e.prices.length; j ++){
                        answer[i]+=1;
                    System.out.println(answer[i]);
                        if (e.prices[i]>e.prices[j]){
                            break;
                    }

                }
            }

            return Solution.builder().answer(answer).build();
        };

        Solution test (Solution s){
            return f.solution(s);
        }
    }

    @Test
    void testSolution(){
        int[] prices = {1, 2, 3, 2, 3};
        Service s1 = new Service();
        Solution s = Solution.builder().prices(prices).build();
        System.out.println(s1.test(s));



    }
}
