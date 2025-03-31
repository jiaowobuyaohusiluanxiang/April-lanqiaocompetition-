import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_旋转 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        int[][] res = new int[m][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<m;i++) {
            for(int j =0;j<n;j++) {
                res[i][j] = arr[n-1-j][i];
            }
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}