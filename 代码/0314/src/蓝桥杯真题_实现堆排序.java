import java.util.PriorityQueue;
import java.util.Scanner;

public class 蓝桥杯真题_实现堆排序 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();//吃掉换行
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();//默认最小堆
        for(int i=0;i<n;i++) {
            StringBuilder builder=new StringBuilder(scanner.next());
            //System.out.println(builder);
            if(builder.toString().equals("push")) {//加入
                int x=scanner.nextInt();
                queue.add(x);
            }
            if(builder.toString().equals("remove")){
                if(queue.isEmpty()) {
                    System.out.println("empty");
                }else {
                    queue.poll();
                }
            }
            if(builder.toString().equals("min")){
                if(queue.isEmpty()) {
                    System.out.println("empty");
                }else {
                    System.out.println(queue.peek());
                }
            }
            if(builder.toString().equals("print")){
                int x=scanner.nextInt();
                for(int k=0;k<x-1;k++) {
                    System.out.print(queue.poll()+" ");
                }
                System.out.println();
                queue.poll();
            }
            scanner.nextLine();//吃掉换行符
        }
        scanner.close();
    }
}