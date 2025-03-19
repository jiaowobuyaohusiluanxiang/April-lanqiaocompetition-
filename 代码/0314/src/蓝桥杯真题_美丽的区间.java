import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_美丽的区间 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = scan.nextInt();
        }
        int low = 0;
        int high = 0;
        int res = n;
        int sum = 0;
      while (high < n) {
          sum = sum + a[high];
            while(sum>=s) {
                res = Math.min(res,high-low+1);
                sum = sum -a[low];
                low++;
            }
            high++;
        }
      if(res == n) {
          System.out.println(0);
      }
      else {
          System.out.println(res);
      }
        scan.close();
    }
}