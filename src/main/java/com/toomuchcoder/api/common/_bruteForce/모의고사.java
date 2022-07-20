package com.toomuchcoder.api.common._bruteForce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName: com.toomuchcoder.api.common._bruteForce
 * fileName        : 모의고사.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 모의고사 {
    public static int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int[] scores = {0,0,0}; // 수포자들 답 맞은 개수
        // 비교
        for(int i = 0; i < answers.length; i++){
            if(first[i % 5] == answers[i]){ scores[0]++;}
            if(second[i % 8] == answers[i]){ scores[1]++;}
            if(third[i % 10] == answers[i]){ scores[2]++;}
        }

        int[] arr = new int[scores.length];
        for(int i = 0; i < scores.length; i++){
            arr[i] = scores[i];
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            if(scores[i] == arr[2]){
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
