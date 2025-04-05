import java.util.ArrayList;
import java.util.Scanner;

public class java0404_008 {
    public static void main(String[] args) {
        // 输入处理
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 将输入序列存入 ArrayList
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        // 执行 K 次操作
        for (int k = 0; k < K; k++) {
            // 找到最小值及其索引
            int minVal = A.get(0);
            int minIdx = 0;
            for (int i = 1; i < A.size(); i++) {
                if (A.get(i) < minVal) {
                    minVal = A.get(i);
                    minIdx = i;
                }
            }

            // 更新相邻元素
            if (minIdx > 0) { // 有左邻居
                A.set(minIdx - 1, A.get(minIdx - 1) + minVal);
            }
            if (minIdx < A.size() - 1) { // 有右邻居
                A.set(minIdx + 1, A.get(minIdx + 1) + minVal);
            }

            // 删除最小值
            A.remove(minIdx);
        }

        // 输出结果
        for (int i = 0; i < A.size(); i++) {
            System.out.print(A.get(i));
            if (i < A.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        sc.close();
    }
}