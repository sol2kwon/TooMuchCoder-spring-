package com.toomuchcoder.api.common._sort;

import com.toomuchcoder.api.common._bruteForce.ATM;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * packageName: com.toomuchcoder.api.common._sort
 * fileName        : 두배열의원소교체.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * 동빈이는 두 개의 배열 A와 B를 가지고 있다. 두 배열은 N개의 원소로 구성되어 있으며,
 * 배열의 원소는 모두 자연수이다. 동빈이는 최대 K번의 바꿔치기 연산을 수행할 수 있는데,
 * 바꿔치기 연산이란 배열 A에 있는 원소 하나와 배열 B에 있는 원소 하나를 골라서 두 원소를 서로 바꾸는 것을 말한다.
 * 동빈이의 최종 목표는 배열 A의 모든 원소의 합이 최대가 되도록 하는 것이다.
 * N, K와 배열 A, B의 정보가 주어졌을 때,
 * 최대 K번의 바꿔치기 연산을 수행하여 만들 수 있는 배열 A의 모든 원소의 합의 최댓값을 출력하는 프로그램을 작성하시오.
 *
 * [ 예시(N = 5, K = 3일때) ]
 *
 * 배열 A = {1, 2, 5, 4, 3}
 * 배열 B = {5, 5, 6, 6, 5}
 * 첫 번째 연산 : 배열 A의 1과 배열 B의 6을 바꾼다.
 * 두 번째 연산 : 배열 A의 2와 배열 B의 6을 바꾼다.
 * 세 번째 연산 : 배열 A의 3과 배열 B의 5를 바꾼다.
 * 따라서 배열 A는 [6, 6, 5, 4, 5]가 되며 이때 배열 A의 모든 원소의 합은 26이 되며 이보다 더 합을 크게 만들 수 없으므로 이 문제의 정답은 26이다.
 * [ 입력 조건 ]
 *
 * 첫 번째 줄에 N, K가 공백으로 구분되어 입력된다.
 * 두 번째 줄에 배열 A의 원소들이 공백으로 구분되어 입력된다.
 * 세 번째 줄에 배열 B의 원소들이 공백으로 구분되어 입력된다.
 * [ 출력 조건 ]
 *
 * 최대 K번의 바꿔치기 연산을 수행하여 만들 수 있는 배열 A의 모든 원소들의 합의 최댓값을 출력한다.
 * [ 입력 예시 ]
 * 5 3
 * 1 2 5 4 3
 *
 * [ 출력 예시 ]
 * 26
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 두배열의원소교체 {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor

    public static class Solution{
        private int[] a;
        private Integer[] b;
        private int n;
        private int k;
        private int amax;

        public String toString(){
            return String.format("A배열: %s B배열: %s A원소합의 최대값: %d"
                                    ,Arrays.toString(a),Arrays.toString(b),amax);
        }
    }
    @FunctionalInterface
    private interface SolutionService{
        Solution solution (Solution s);
    }

    class Service{
        SolutionService f = e ->{
            Arrays.sort(e.a);
            Arrays.sort(e.b,Collections.reverseOrder());

            for (int i = 0; i<e.n; i++){
                if (e.a[i] < e.b[i] && e.a[i] <= e.k){
                    int temp = e.a[i];
                    e.a[i] = e.b[i];
                    e.b[i] = temp;
                }else{
                    break;
                }
            }
            for (int i : e.a){
                e.amax += i;
            }
            return Solution.builder().a(e.a).b(e.b).amax(e.amax).build();
        };
        Solution test(Solution s){
            return f.solution(s);
        }
    }
    @Test
    void testSolution(){
        int[] a = {1, 2, 5, 4, 3};
        Integer[] b = {5, 5, 6, 6, 5};
        int n = 5;
        int k = 3;
        int amax = 0;
        Solution s = Solution.builder().a(a).b(b).k(k).n(n).amax(amax).build();
        Service s1 = new Service();
        System.out.println(s1.test(s));
    }
}
