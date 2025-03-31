import java.util.Arrays;
import java.util.Scanner;

public class 蓝桥杯真题_位运算操作 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int m = scan.nextInt();

        // 计算 n 的二进制位数，至少 30 位
        int count = 0;
        long temp = n;
        while (temp != 0) {
            count++;
            temp /= 2;
        }
        int[] array1 = new int[Math.max(count, 30)];
        temp = n;
        for (int i = 0; i < count; i++) {
            array1[i] = (int)(temp % 2);
            temp /= 2;
        }

        // 处理 m 次操作
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            if (a == 1) {
                int x = scan.nextInt();
                System.out.println(array1[x]);
            } else if (a == 2) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                for (int j = l; j <= r; j++) { // 包含 r
                    array1[j] = array1[j] == 0 ? 1 : 0; // 按位取反
                }
                long result = 0;
                for (int j = 0; j < array1.length; j++) {
                    if (array1[j] != 0) {
                        result += (1L << j);
                    }
                }
                System.out.println(result);
            } else if (a == 3) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                for (int j = l; j <= r; j++) { // 包含 r
                    array1[j] = 1; // 设为 1
                }
                long result = 0;
                for (int j = 0; j < array1.length; j++) {
                    if (array1[j] != 0) {
                        result += (1L << j);
                    }
                }
                System.out.println(result);
            } else if (a == 4) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                for (int j = l; j <= r; j++) { // 包含 r
                    array1[j] = 0; // 设为 0
                }
                long result = 0;
                for (int j = 0; j < array1.length; j++) {
                    if (array1[j] != 0) {
                        result += (1L << j);
                    }
                }
                System.out.println(result);
            } else if (a == 5) {
                long result = 0;
                for (int j = 0; j < array1.length; j++) { // 从低位到高位找最后一个 1
                    if (array1[j] == 1) {
                        result = (1L << j);
                    }
                }
                System.out.println(result); // 如果没有 1，则输出 0
            }
        }
        scan.close();
    }
}