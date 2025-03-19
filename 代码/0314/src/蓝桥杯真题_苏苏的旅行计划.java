import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_苏苏的旅行计划 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        int sum = 1;
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
        }
        int lingjie = a[1];
        for(int i = 1 ;i<n;i++){
            int k = a[i-1];
            if(a[i]>=k&&a[i]<=lingjie) {
                sum++;
                lingjie = a[i];
            }
            if(k>=a[i]&&lingjie>=a[i]) {
                lingjie = a[i];
                sum++;
            }

        }
        System.out.println(sum);
        scan.close();
    }
}