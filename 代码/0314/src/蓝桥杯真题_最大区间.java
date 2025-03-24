import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// 1:无需package
// 2: 类名必须Main, 不可修改
//暴力解法
public class 蓝桥杯真题_最大区间 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int res = 0;
        int length=0;
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
        }
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i =0;i<n;i++) {
            while(!stack.isEmpty()&&a[stack.pop()]>a[i]) {
                stack.pop();//找最小值
            }
            if(!stack.isEmpty()) {
                 length = Math.abs(stack.pop()-i)+1;
                res = Math.max(res,length*a[stack.pop()]);
            }
            length = 0;
            if(a[i]!=a[stack.pop()]){
                stack.push(i);
            }
        }
        System.out.print(res);
        scan.close();
    }
}