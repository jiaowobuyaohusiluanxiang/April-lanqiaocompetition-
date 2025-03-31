import java.util.Scanner;

public class grok自定义_数字排列 {
    static int n;
    static int res = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        boolean[] used = new boolean[n + 1];
        int[] arr = new int[n];
        dfs(0, used, arr);
        System.out.println(res);
        scan.close();
    }

    static void dfs(int index, boolean[] used, int[] arr) {
        if (index == n) {
            res++;
            return;
        }
        for (int i = 1; i <= n; i++) {

            if (!used[i]) {
                if (index == 0 || Math.abs(arr[index - 1] - i) == 1) {//第一个肯定要插入。index天然有回溯
                    arr[index] = i;
                    used[i] = true;
                    dfs(index + 1, used, arr);
                    used[i] = false;
                }
            }
        }
    }
}