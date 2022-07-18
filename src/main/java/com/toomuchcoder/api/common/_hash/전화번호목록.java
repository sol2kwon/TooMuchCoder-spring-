package com.toomuchcoder.api.common._hash;

import com.toomuchcoder.api.common._greedy.구명보트;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName: com.toomuchcoder.api.common._hash
 * fileName        : 전화번호목록.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 전화번호목록 {
    @Builder
    @Getter @AllArgsConstructor @NoArgsConstructor
    public static class Solution{
        private String[] phone_book;
        private boolean answer;

        @Override public String toString(){
            return String.format("%d", answer);
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    public static class Service{
        SolutionService f = e -> {
            e.answer = true;
            Arrays.sort(e.phone_book);
            for (int i = 0; i< e.phone_book.length; i++){
                if (e.phone_book[i+1].startsWith(e.phone_book[i]))
                    return null;
            }
            return Solution.builder()
                    .phone_book(e.getPhone_book())
                    .answer(e.answer)
                    .build();
        };
        Solution test(Solution s){
            return f.solution(s);
        }
    }
    @Test void testSolutionTest(){
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean answer = false;
        Service service = new Service();
        Solution solution = Solution.builder()
                .phone_book(phone_book)
                .answer(answer)
                .build();
        System.out.println(service.test(solution));
    }
}
