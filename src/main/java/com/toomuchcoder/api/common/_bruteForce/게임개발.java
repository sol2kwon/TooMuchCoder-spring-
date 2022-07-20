package com.toomuchcoder.api.common._bruteForce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * packageName: com.toomuchcoder.api.common._bruteForce
 * fileName        : 게임개발.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 게임개발 {
    static int N;
    static Building[] buildingList;
    static int input;
    static Queue<Integer> queue;
    static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //1.입력
        N= Integer.parseInt(br.readLine());
        buildingList= new Building[N+1];
        for(int i=1; i<=N; i++){
            buildingList[i]= new Building();
        }

        //2. N개의 건물정보 입력
        for(int i=1; i<=N; i++) {
            st= new StringTokenizer(br.readLine());

            buildingList[i].time= Integer.parseInt(st.nextToken());
            input= Integer.parseInt(st.nextToken());
            while(input!=-1) {
                buildingList[i].inDegree++;
                buildingList[input].adjList.add(i);
                input= Integer.parseInt(st.nextToken());
            }
        }

        //2. 위상정렬 재료 만들기
        //- 선행건물이 없는 경우(inDegree=0)인 경우 큐에 넣기
        queue= new ArrayDeque<Integer>();
        for(int i=1; i<=N; i++) {
            if(buildingList[i].inDegree==0) {
                queue.add(i);
            }
        }

        //3. 위상정렬
        while(!queue.isEmpty()) {
            //1) 선행건물이 더이상 없는 녀석을 뽑아서 최종 건설시간에 자기 자신을 더해줌
            int quePoll= queue.poll();
            buildingList[quePoll].result+= buildingList[quePoll].time;

            //2) 자신을 지어야 지을 수 있는 건물들에게 선행건물의 건설이 끝났음을 알림
            for(int i: buildingList[quePoll].adjList) {
                //2-1) 선행건물의 개수 빼주기
                buildingList[i].inDegree--;
                //2-2) 타겟건물은 아직 건물을 지을 수 없는 상태
                //->현재 상태에서 타겟 건물의 res는 선행건물의 건설시간 중 최댓값: res를 최댓값으로 갱신시켜야
                buildingList[i].result= Math.max(buildingList[i].result, buildingList[quePoll].result);
                //2-3) 타겟건물의 선행건물 개수가 0이면 큐에 넣기
                if(buildingList[i].inDegree==0) queue.add(i);
            }
        }

        for(int i=1; i<=N; i++) {
            sb.append(buildingList[i].result+"\n");
        }
        System.out.println(sb.toString());

    }//main

    public static class Building{
        int time;		//각 건물 건설시간
        int inDegree;	//건물의 선행조건 개수
        int result;		//선행건물 포함 건설시간
        ArrayList<Integer> adjList; //건물이 지어져야 지을수 있는 건물들

        public Building() {
            this.time= 0;
            this.inDegree= 0;
            this.result= 0;
            this.adjList= new ArrayList<Integer>();
        }
    }
}
