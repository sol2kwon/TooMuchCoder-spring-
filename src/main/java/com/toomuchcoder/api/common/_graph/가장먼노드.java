package com.toomuchcoder.api.common._graph;

import com.toomuchcoder.api.common._bruteForce.ATM;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName: com.toomuchcoder.api.common._graph
 * fileName        : 가장먼노드.java
 * author          : solyikwon
 * date            : 2022-05-25
 * desc            :\
 * * 문제 설명
 *  * n개의 노드가 있는 그래프가 있습니다. 각 노드는 1부터 n까지 번호가 적혀있습니다. 1번 노드에서 가장 멀리 떨어진 노드의 갯수를 구하려고 합니다. 가장 멀리 떨어진 노드란 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드들을 의미합니다.
 *  *
 *  * 노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때, 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 return 하도록 solution 함수를 작성해주세요.
 *  *
 *  * 제한사항
 *  * 노드의 개수 n은 2 이상 20,000 이하입니다.
 *  * 간선은 양방향이며 총 1개 이상 50,000개 이하의 간선이 있습니다.
 *  * vertex 배열 각 행 [a, b]는 a번 노드와 b번 노드 사이에 간선이 있다는 의미입니다.
 *  *
 *  *
 *  * 입출력 예
 *  * n	vertex	return
 *  * 6	[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]	3
 *  * 입출력 예 설명
 *  * 예제의 그래프를 표현하면 아래 그림과 같고, 1번 노드에서 가장 멀리 떨어진 노드는 4,5,6번 노드
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25         solyikwon      최초 생성
 **/
public class 가장먼노드 {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    public static class Solution{
        private int n;
        private int[][] edge;
        private int answer;

        @Override public String toString(){
            return String.format("n: %d \nedge: %s \nanswer:%d", n, Arrays.deepToString(edge),answer);
        }
    }
    @FunctionalInterface public interface SolutionService{
        Solution solution(Solution s);
    }

    public static class Service{
        SolutionService f = e -> {
            e.answer = 0;
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            int[] distance = new int[e.n+1];
            //System.out.println("0 :" + e.n);
            for (int i = 0; i < e.n+1; i++)
                graph.add(new ArrayList<>());
            for (int i = 0; i < e.edge.length; i++){
                graph.get(e.edge[i][0]).add(e.edge[i][1]);
                graph.get(e.edge[i][1]).add(e.edge[i][0]);
            }
            boolean[] visited = new boolean[e.n+1];
            visited[1] = true;
            Queue<Integer> bfs = new LinkedList<>();
            bfs.add(1);
            while (bfs.size() != 0) {
                int nowNode = bfs.poll();
                ArrayList<Integer> node = graph.get(nowNode);
                //System.out.println("1 : "+ node.size());
                for (Integer integer : node) {
                    if (!visited[integer]) {
                        bfs.add(integer);
                        visited[integer] = true;
                        distance[integer] = distance[nowNode] + 1;
                    }
                }
            }
            Arrays.sort(distance);
            int max = distance[distance.length -1];
            //System.out.println("2 : "+ distance.length);
            for (int i = distance.length-1; distance[i] == max; i--)
                e.answer++;
            return Solution.builder()
                    .n(e.getN())
                    .edge(e.getEdge())
                    .answer(e.getAnswer())
                    .build();
        };
        Solution test(Solution s){
            return f.solution(s);
        }
    }
    @Test void testSolutionTest(){
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int answer = 0;
        Service service = new Service();
        Solution solution = Solution.builder()
                .n(n)
                .edge(edge)
                .answer(answer)
                .build();
        System.out.println(service.test(solution));
    }
}
