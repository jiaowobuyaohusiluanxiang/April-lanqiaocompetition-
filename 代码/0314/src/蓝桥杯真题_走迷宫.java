import java.util.*;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_走迷宫 {
    static int[] x = {-1,0,1,0};
    static int[] y = {0,-1,0,1};

    static int m,n;
    static int[][] visited ;//标记是否被访问过
    static int startx,starty,endx,endy=0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        int[][] ditu = new int[n][m];
        visited = new int [n][m];
        for (int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
               ditu[i][j] = scan.nextInt();
            }
        }
         startx =scan.nextInt();
         starty =scan.nextInt();
         endx =scan.nextInt();
         endy =scan.nextInt();

        System.out.println(dfs(ditu,startx-1,starty-1));

    }

    private static int dfs(int [][]ditu, int startx, int starty) {
        Queue<int[]> stack = new ArrayDeque<>();
        stack.offer(new int[] {startx,starty,0});
        while (!stack.isEmpty()){
            int[] poll = stack.poll();
            int x1 = poll[0];
            int y1 = poll[1];
            int step = poll[2];
            if(x1==endx-1&& y1 ==endy-1 ) {
                return step;
            }
            for (int i=0;i<4;i++) {
                int x2 =x1+x[i];
                int y2 = y1+y[i];
                if(x2>=0&&y2>=0&&x2<n&&y2<m&&visited[x2][y2]==0&&ditu[x2][y2]==1) {
                    visited[x2][y2]=1;//标记已经被访问过
                    stack.offer(new int[]{x2,y2,step+1});//进去才加
                }
            }
        }
          return -1;
    }

}