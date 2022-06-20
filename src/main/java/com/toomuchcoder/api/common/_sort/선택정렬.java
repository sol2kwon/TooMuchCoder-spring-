package com.toomuchcoder.api.common._sort;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.toomuchcoder.api.common._sort.SwapMethod.swap;


/**
 * packageName: com.toomuchcoder.api.common._sort
 * fileName        : SelectionSort.java
 * author          : solyikwon
 * date            : 2022-05-24
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-24         solyikwon      최초 생성
 **/
public class 선택정렬 {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution {
        private int [] array ;

        public String toString() {
            return Arrays.toString(array);
        }
    }
    @FunctionalInterface
    private interface SolutionService {
        Solution solution(Solution s);
    }

    class Service {
        SolutionService f = e ->{
            for (int i = 0; i<e.array.length-1; i++){
                int min = i;
                for (int j = i+1; j<e.array.length; j++){
                    if (e.array[j]<e.array[min]){
                        min=j;
                    }
                }
                swap(e.array,min,i);
            }
            return Solution.builder().array(e.array).build();
        };

        Solution test(Solution s) {
            return f.solution(s);
        }
    }
    @Test
    void testSolution() {
            int [] arr = {7,5,2,9,10,11,15};
            Solution s = Solution.builder().array(arr).build();
            Service s2 = new Service();
            System.out.println(s2.test(s));
    }


}
