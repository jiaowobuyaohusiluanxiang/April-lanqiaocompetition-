import java.util.Scanner;

public class 蓝桥杯真题_连续子序列的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取 n 和 m 的值
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        // 创建长度为 n 的数组来存储输入的元素
        long[] a = new long[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        // 初始化左右指针、当前子数组的和以及满足条件的子数组数量
        long left = 0;
        long right = 0;
        long sum = 0;
        long cnt = 0;

        // 使用滑动窗口来遍历数组
        while (right < n) {
            // 累加当前元素到总和
            sum += a[(int) right];
            // 当总和大于等于 m 时，更新满足条件的子数组数量并调整左指针
            while (sum >= m) {
                cnt += (n - right);
                sum -= a[(int) left];
                left++;
            }
            // 右指针右移
            right++;
        }

        // 输出满足条件的子数组数量
        System.out.println(cnt);
        scanner.close();
    }
}