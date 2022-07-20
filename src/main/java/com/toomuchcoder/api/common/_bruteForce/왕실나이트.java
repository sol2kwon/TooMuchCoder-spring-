package com.toomuchcoder.api.common._bruteForce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName: com.toomuchcoder.api.common._bruteForce
 * fileName        : 왕실나이트.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 *  * packageName: kr.co.clozet.common.common._bruteForce
 *  * fileName   : 왕실의나이트
 *  * author     : kimyunseop
 *  * date       : 2022-05-24
 *  * desc       :
 *  * 행복 왕국의 왕실 정원은 체스판과 같은 8 X 8 좌표 평면이다. 왕실 정원의 특정한 한 칸에 나이트가 서 있다.
 *  * 나이트는 매우 충성스러운 신하로서 매일 무술을 연마한다.
 *  *
 *  * 나이트는 말을 타고 있기 때문에 이동을 할 때에는 L자 형태로만 이동할 수 있으며 정원 밖으로는 나갈 수 없다.
 *  * 나이트는 특정한 위치에서 다음과 같은 2가지 경우로 이동할 수 있다.
 *  *
 *  * 1.수평으로 두 간 이동한 뒤에 수직으로 한 칸 이동하기
 *  * 2.수직으로 두 간 이동한 뒤에 수평으로 한 칸 이동하기
 *  * 또 다른 예로 나이트가 c2에 위치해 있다면 나이트가 이동할 수 있는 경우의 수는 6가지이다. 이건 직접 계산해보시오.
 *
 *  문자열로 된 시작점을 행과 열로 나눈다.
 *
 * 시작점에서 8방 탐색. (나이트 이동형태)
 *
 * 탐색한 좌표가 8x8 체스판 범위 안에 있는 것만 개수를 센다.
 *  * ================================
 *  * DATE        AUTHOR        NOTE
 *  * ================================
 *  * 2022-05-24   kimyunseop  최초 생성
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 왕실나이트 {
    static int[][] dir = {{-2, 1}, {-2, -1}, {2, 1}, {2, -1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = 0;

        int row = input.charAt(1) - '1';
        int col = input.charAt(0) - 'a';

        for (int i = 0; i < 8; i++) {
            int nr = row + dir[i][0];
            int nc = col + dir[i][1];

            if (nr < 0 || nr > 7 || nc < 0 || nc > 7) continue;
            answer++;
        }

        System.out.println(answer);
    }
}
