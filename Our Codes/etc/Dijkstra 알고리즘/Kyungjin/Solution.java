package dijkstra.solution;

import java.util.Arrays;

public class Solution {

    public int solve(int[][] graph, int start, int via, int end) {
        int start_to_via = dijkstra(graph, start, via);
        int via_to_end = dijkstra(graph, via, end);

        if(start_to_via == Integer.MAX_VALUE || via_to_end == Integer.MAX_VALUE)
            return -1;

        return start_to_via + via_to_end;
    }

    private int dijkstra(int[][] graph, int start, int end) {
        int[] dp = new int[graph.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[start] = 0;

        boolean[] visited = new boolean[graph.length];
        visited[start] = true;

        for(int i=0; i<dp.length; i++) {
            if(graph[start][i] != 0)
                dp[i] = graph[start][i];
        }

        while(true) {
            int minIndex = getMinIndex(dp, visited);

            if(minIndex == -1)
                break;

            visited[minIndex] = true;

            for(int i=0; i<graph.length; i++) {
                if(graph[minIndex][i] != 0)
                    dp[i] = Math.min(dp[i], dp[minIndex] + graph[minIndex][i]);
            }
        }

        return dp[end];
    }

    private int getMinIndex(int[] dp, boolean[] visited) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;

        for(int i=0; i<dp.length; i++) {
            if(dp[i] < minValue && !visited[i])
                minIndex = i;
        }

        return minIndex;
    }
}
