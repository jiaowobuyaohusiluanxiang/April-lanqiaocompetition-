import java.util.*;

public class 蓝桥杯真题_单调栈 {
    public static void main(String[] args) {
        Deque<Integer> stack =new ArrayDeque<>();//使用双端队列，实现单调栈
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            array[i] = scan.nextInt();
        }
        int[] leftbigger = new int[n];
        int[] rightbigger = new int[n];
        int[] leftsmaller = new int[n];
        int[] rightsmaller = new int[n];

        Arrays.fill(leftbigger,-1);
        Arrays.fill(rightbigger,-1);
        Arrays.fill(leftsmaller,-1);
        Arrays.fill(rightsmaller,-1);

        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && array[stack.peek()]<=array[i]){//保证stack里存的是大的，不是就要pop出来。
                stack.pop();
            }
            if(!stack.isEmpty()) {
                leftbigger[i] = array[stack.peek()];
            }

            stack.push(i);

        }
        stack.clear();

        for(int i=n-1;i>=0;i--) {
            while(!stack.isEmpty()&&array[stack.peek()]<=array[i]){//保证stack里存的是大的，不是就要pop出来。
                stack.pop();
            }
            if(!stack.isEmpty()) {
                rightbigger[i] = array[stack.peek()];
            }

            stack.push(i);

        }
        stack.clear();

        for(int i=0;i<n;i++) {
            while(!stack.isEmpty()&&array[stack.peek()]>=array[i]){//保证stack里存的是小的，不是就要pop出来。
                stack.pop();
            }
            //刚开始栈为空
            if(!stack.isEmpty()) {
                leftsmaller[i] = array[stack.peek()];
            }

            stack.push(i);

        }
        stack.clear();

        for(int i=n-1;i>=0;i--) {
            while(!stack.isEmpty()&&array[stack.peek()]>=array[i]){//保证stack里存的是xiao的，不是就要pop出来。
                stack.pop();
            }
            if(!stack.isEmpty()) {
                rightsmaller[i] = array[stack.peek()];
            }

            stack.push(i);

        }
        stack.clear();



       display(leftbigger);
        display(rightbigger);
        display(leftsmaller);
        display(rightsmaller);

        scan.close();
    }
    private static void display(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}