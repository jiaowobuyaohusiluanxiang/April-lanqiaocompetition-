import java.util.*;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_连续子序列的个数 {
    static int res = 0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        long m = scan.nextLong();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
          int right = 0;
          int left = 0;
          long sum = 0;
        while(left<right&&right<n) {
            while(right<n) {
                sum = sum+arr[right];
                if(sum<m) {
                    right++;
                }else {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        scan.close();
    }

}