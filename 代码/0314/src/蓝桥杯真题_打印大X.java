import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_打印大X {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        char[][] arr = new char[n][(n/2)*2+m];
        int o = arr.length;
        int p = arr[0].length;
        for(int i=0;i<o;i++) {
            for(int j=0;j<p;j++) {
                arr[i][j] = '_';
            }
        }

        for(int i=0;i< o;i++) {
            for(int j=i;j<i+m;j++) {
                arr[i][j] = '*';//处理左上到右下
            }
        }

        for(int i=0;i<o;i++) {
            for(int j=p-1-i;j>p-i-m-1;j--) {
                arr[i][j] = '*';
            }
        }
        for(int i=0;i<o;i++) {
            for(int j=0;j<p;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }

}
