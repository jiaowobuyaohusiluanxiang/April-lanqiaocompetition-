import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int q = scan.nextInt();
        int[][] a = new int[n+1][m+1];
        int[][] s = new int[n+1][m+1];
        int A = 0;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                a[i][j] = scan.nextInt();
                s[i][j] =s[i-1][j]+s[i][j-1]-s[i-1][j-1]+a[i][j];
            }
        }
        for(int i=0;i<q;i++) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            A = s[x2][y2]-s[x2][y1-1]-s[x1-1][y2]+s[x1-1][y1-1];
            System.out.println(A);
            A=0;
        }
        scan.close();
    }
}