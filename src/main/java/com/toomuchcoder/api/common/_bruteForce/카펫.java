package com.toomuchcoder.api.common._bruteForce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName: com.toomuchcoder.api.common._bruteForce
 * fileName        : 카펫.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
 *
 * Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * 제한사항
 * 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
 * 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
 * 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
 * - 입출력 예
 *
 * brown	yellow	return
 * 10	2	[4, 3]
 * 8	1	[3, 3]
 * 24	24	[8, 6]
 *
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 카펫 {
    private static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int area = brown + yellow; //전체 갯수

        //행과 열의 갯수는 3이상이여야 합니다.
        for (int i = 3; i <= area; i++) {
            int col = i;             // 열
            int row = area / col;    // 행

            //행의 갯수가 3이하이면 Pass합니다.
            if(row<3){
                continue;
            }

            //행은 열보다 크거나 같아야 합니다.
            if(row>=col) {
                //문제의 규칙에 의하면 row-2*col-2 = yellow 입니다.
                if((row-2) * (col-2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    return answer;
                }
            }

        }
        return answer;
    }
}
