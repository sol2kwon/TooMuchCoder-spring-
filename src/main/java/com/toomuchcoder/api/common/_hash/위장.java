package com.toomuchcoder.api.common._hash;

import com.toomuchcoder.api.common._greedy.구명보트;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName: com.toomuchcoder.api.common._hash
 * fileName        : 위장.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 위장 {
    @Builder
    public static class Solution{

        @Override public String toString(){
            return String.format("");
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    public static class Service{
        SolutionService f = e -> {
            return Solution.builder().build();
        };
        Solution test(Solution s){
            return f.solution(s);
        }
    }
    @Test void testSolutionTest(){
        Service service = new Service();
        Solution solution = Solution.builder().build();
        System.out.println(service.test(solution));
    }
}
