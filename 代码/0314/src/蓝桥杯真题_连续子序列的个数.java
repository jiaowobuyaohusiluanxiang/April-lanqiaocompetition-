import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_连续子序列的个数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int res = 0;
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
            if(a[i]%k==0) {
                res ++;
            }
        }
        int left = 0;
        int right = 1;
        int sum =0;
        while (right < n) {
            // 累加当前元素到总和
            sum += a[right];
            // 当总和大于等于 m 时，更新满足条件的子数组数量并调整左指针
            while (sum%k!=0) {
                sum -= a[left];
                left++;
            }
            // 右指针右移
            right++;
            res++;
        }
        scan.close();
        System.out.println(res);
    }
}