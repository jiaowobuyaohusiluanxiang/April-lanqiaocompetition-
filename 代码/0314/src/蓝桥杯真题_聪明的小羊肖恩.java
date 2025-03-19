import java.util.Scanner;
import java.util.Arrays;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_聪明的小羊肖恩 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long l = scan.nextLong();
        long r = scan.nextLong();
        long res = 0;
        long[] a = new long[(int)n];
        for (long i=0;i<n;i++) {
            a[(int)i] = scan.nextInt();
        }
        Arrays.sort(a);//先排序，完成数组的单调性

        for(long i=0;i<n;i++) {
            long j = n-1; //j做右指针
            while(j>i&&a[(int)j]+a[(int)i]>r) {
                j--;//先找一边
            }
            long k = i+1;
            while (k<=j&&a[(int)i]+a[(int)k]<l) {
                k=k+1;
            }
            res = res +Math.max(0,j-k+1);
        }

        System.out.print(res);
        scan.close();
    }
}