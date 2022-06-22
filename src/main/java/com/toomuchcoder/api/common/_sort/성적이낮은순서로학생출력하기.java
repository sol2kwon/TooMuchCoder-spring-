package com.toomuchcoder.api.common._sort;

import com.toomuchcoder.api.common._bruteForce.ATM;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * packageName: com.toomuchcoder.api.common._sort
 * fileName        : 성적이낮은순서로학생출력하기.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * N명의 학생 정보가 있다. 학생 정보는 학생의 이름과 학생의 성적으로 구분된다.
 * 각 학생의 이름과 성적 정보가 주어졌을 때 성적이 낮은 순서대로 학생의 이름을 출력하는 프로그램을 작성하시오.
 * 입력 조건
 * 첫 번째 줄의 학생의 수 N이 입력된다. (1 ≤ N ≤ 100,000)
 * 두 번째 줄부터 N + 1번째 줄에는 학생의 이름을 나타내는 문자열 A와 학생의 성적을 나타내는 정수 B가 공백으로 구분되어 입력된다.
 * 문자열 A의 길이와 학생의 성적은 100 이하의 자연수이다.
 * 출력 조건
 * ◽  모든 학생의 이름을 성적이 낮은 순서대로 출력한다. 성적이 동일한 학생들의 순서는 자유롭게 출력해도 괜찮다.
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 성적이낮은순서로학생출력하기 {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor

    public static class Solution{
        private String[] name;
        private String[] score;
        private int n;
        private String[] temp;



        public String toString(){
            return String.format("");
        }

    }
    @FunctionalInterface private interface SolutionService{
        Solution solution (Solution s);
    }

    @Test
    void testSolution(){
        String[] name = {"권솔이","김한슬","홍정명"};
        String[] score = {"85","72","32"};
        int n = 2;


        Solution s = Solution.builder().name(name).score(score).n(n).build();

        SolutionService f = e ->{
        List<Map<String,String>> listMapInsert = new ArrayList<Map<String,String>>();
        for (int i = 0; i<=n; i++){
            Map<String,String> map = new HashMap<String,String>();
            map.put(name[i],score[i]);

            listMapInsert.add(map);


            System.out.println("List Map Insert : " + listMapInsert.toString());//확인
            System.out.println("");


        }

        return Solution.builder().name(name).score(score).n(n).build();
        };
        System.out.println(f.solution(s));


    }
}
