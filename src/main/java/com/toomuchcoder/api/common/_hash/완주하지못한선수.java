package com.toomuchcoder.api.common._hash;

import com.toomuchcoder.api.common._greedy.구명보트;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * packageName: com.toomuchcoder.api.common._hash
 * fileName        : 완주하지못한선수.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 완주하지못한선수 {
    @Builder
    @Getter @AllArgsConstructor @NoArgsConstructor

    public static class Solution{
        //속성ㅇㅇ
        private String[] participant, completion;
        private String answer;

        @Override public String toString(){
            return String.format("participant %s,completion %s,answer %s",
                    Arrays.toString(participant), Arrays.toString(completion),answer);
        }
    }
    @FunctionalInterface public interface SolutionsService{
        Solution solution(Solution s);
    }

    static class Service{
        SolutionsService f = e -> {
            //기능
            e.answer = "";
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (String player : e.participant) hashMap.put(player, hashMap.getOrDefault(player, 0)+1);
            for (String player : e.completion) hashMap.put(player, hashMap.get(player)-1);
            for (String key : hashMap.keySet()){
                if (hashMap.get(key) !=0){
                    e.answer = key;
                }
            }
            return Solution.builder()
                    .answer(e.getAnswer())
                    .participant(e.getParticipant())
                    .completion(e.getCompletion())
                    .build();
        };
        Solution test(Solution s){return f.solution(s);}
    }
    @Test void testSolutionsTest(){
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = "";
        Service service = new Service();
        Solution solution = Solution.builder()
                .answer(answer)
                .completion(completion)
                .participant(participant)
                .build();
        System.out.println(service.test(solution));
    }
}
