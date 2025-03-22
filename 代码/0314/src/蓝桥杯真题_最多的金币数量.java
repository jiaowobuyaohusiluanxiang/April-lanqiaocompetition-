import java.util.*;


public class 蓝桥杯真题_最多的金币数量 { // Class name must be Main
    static int[] dx = {0, 1, 0, -1}; // Directions: right, down, left, up
    static int[] dy = {1, 0, -1, 0};
    static int n, m;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        int startx = scan.nextInt() - 1; // Convert to 0-based index
        int starty = scan.nextInt() - 1;
        int endx = scan.nextInt() - 1;
        int endy = scan.nextInt() - 1;
        char[][] ditu = new char[n][m];
        for (int i = 0; i < n; i++) {

                String input =scan.next();
                for(int j=0;j<m;j++) {
                    ditu[i][j] = input.charAt(j);
                }
        }
        int steps = bfs(ditu, startx, starty, endx, endy);
        int maxZeros = n * m - (steps + 1); // Total cells - path length
        System.out.println(maxZeros);
        scan.close();
    }

    private static int bfs(char[][] ditu, int startx, int starty, int endx, int endy) {
        int[][] visited = new int[n][m];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{startx, starty, 0}); // [x, y, steps]
        visited[startx][starty] = 1;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x1 = curr[0];
            int y1 = curr[1];
            int steps = curr[2];
            if (x1 == endx && y1 == endy) {
                return steps; // Return number of steps (edges)
            }
            for (int i = 0; i < 4; i++) {
                int x2 = x1 + dx[i];
                int y2 = y1 + dy[i];
                if (x2 >= 0 && x2 < n && y2 >= 0 && y2 < m && ditu[x2][y2] == '1' && visited[x2][y2] == 0) {
                    queue.offer(new int[]{x2, y2, steps + 1});
                    visited[x2][y2] = 1;
                }
            }
        }
        return -1; // No path found (won’t happen per problem guarantee)
    }
}