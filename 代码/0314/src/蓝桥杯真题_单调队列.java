import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_单调队列 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int a[] = new int[N+1];
        for(int i = 1; i <= N; i ++) {
            a[i] = scan.nextInt();
        }
        solve(N,K,a, true);
        solve(N,K,a, false);
    }
    public static void solve(int N, int k, int[] a, boolean small) {
        Deque<Integer> q = new ArrayDeque<Integer>();
        for(int i = 0; i < N; i ++) {
            while(!q.isEmpty() && (small ? a[q.peekLast()] > a[i] : a[q.peekLast()] < a[i])) {
                q.pollLast();
            }
            q.addLast(i);
            if(i - q.peekFirst() >= k) {
                q.pollFirst();
            }
            if(i >= k) {
                System.out.print(a[q.peekFirst()]+" ");
            }
        }
        System.out.println();
    }
}