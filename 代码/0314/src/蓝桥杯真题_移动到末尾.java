import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_移动到末尾 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();//确保deque使用时，其头尾的状态
        Deque<Integer> newres = new ArrayDeque<>();
        int countzero = 0;
        for(int i=0;i<n;i++) {
            int a = scan.nextInt();
            deque.addLast(a);
        }
        for(int i:deque) {//其遍历的是deque中的值，不是索引
            if(i!=0) {
                newres.addLast(i);
            }else {
                countzero++;
            }
        }
        for(int i:newres) {
            System.out.print(i+" ");
        }
       // System.out.println(countzero+" ");
        for(int i=0;i<countzero;i++) {
            System.out.print(0+" ");
        }
    }
}