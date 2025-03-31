import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_游戏 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            array[i] = scan.nextInt();
        }
        Deque<Integer> max = new LinkedList<>();

        int summax = 0;
        int summin = 0;
       for(int i=0;i<n;i++) {
           while(!max.isEmpty() && array[i] > array[max.peekLast()]) {
               max.pollLast();
           }
           max.addLast(i);
           if(max.getFirst()<=i-k) max.pollFirst();
           if(i>=k-1) {
               summax+=array[max.getFirst()];
           }
       }
       max.clear();
        for(int i=0;i<n;i++) {
            while(!max.isEmpty() && array[i] < array[max.peekLast()]) {
                max.pollLast();
            }
            max.addLast(i);
            if(max.getFirst()<=i-k) max.pollFirst();
            if(i>=k-1) {
                summin+=array[max.getFirst()];
            }
        }
       double res = summax-summin;
        System.out.printf("%.2f",res/(n-k+1));
        System.out.print(1);
    }
}