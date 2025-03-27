import java.util.Arrays;
import java.util.Scanner;

public class 蓝桥杯真题_封闭图形个数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] a = new Integer[n]; // 使用 Integer[] 以支持 Arrays.sort 的比较器
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        // 自定义比较器排序
        Arrays.sort(a, (num1, num2) -> {
            int holes1 = iss(num1);
            int holes2 = iss(num2);
            if (holes1 != holes2) {
                return holes1 - holes2; // 按封闭图形个数升序
            }
            return num1 - num2; // 个数相同，按数值升序
        });

        // 输出
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) System.out.print(" ");
        }
        scan.close();
    }

    private static int iss(int num) {
        int res = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 8) res += 2;
            else if (digit == 0 || digit == 4 || digit == 6 || digit == 9) res += 1;
            num /= 10;
        }
        return res;
    }
}