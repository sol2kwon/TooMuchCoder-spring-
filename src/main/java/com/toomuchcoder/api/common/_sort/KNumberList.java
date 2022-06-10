package com.toomuchcoder.api.common._sort;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName: com.toomuchcoder.api.common._sort
 * fileName        : KNumberList.java
 * author          : solyikwon
 * date            : 2022-06-10
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-10         hong      최초 생성
 **/
public class KNumberList {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution {
        private int[] array;
        private int[][] commands;
        private int[] answer;

        @Override
        public String toString() {
            return String.format("array: %s\ncommands: %s\nreturn: %s\n",
                    Arrays.toString(array), Arrays.deepToString(commands), Arrays.toString(answer));
        }
    }

    @FunctionalInterface
    private interface SolutionService<T, R> {
        R solution(T t);
    }

    @Test
    void testSolution() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution s = Solution.builder()
                .array(array)
                .commands(commands)
                .build();

        SolutionService<Solution, Solution> f = e -> {
            int[] answer = new int[3];
            int answerIndex = 0;
            for (int[] command : e.getCommands()) {
                int[] temp = new int[command[1] - command[0] + 1];
                int tempIndex = 0;
                for (int i = command[0]; i <= command[1]; i++) {
                    temp[tempIndex++] = e.getArray()[i - 1];
                }
                Arrays.sort(temp);
                answer[answerIndex++] = temp[command[2] - 1];
            }
            return Solution.builder()
                    .array(e.getArray())
                    .commands(e.getCommands())
                    .answer(answer)
                    .build();
        };
        System.out.println(f.solution(s));
    }
}
