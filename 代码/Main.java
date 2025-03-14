import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum_zero = 0;
        int a = scan.nextInt();
        int[] array = new int[a];
        for(int i=0;i<a;i++) {
            array[i] = scan.nextInt();
        }
        for(int i=0;i<a;i++) {
            int b = scan.nextInt();
            if(b != 0) {
                System.out.print(b+" ");
            }
            else sum_zero ++;
        }
        for(int i=0;i<sum_zero;i++) {
            System.out.print("0 ");
        }
        scan.close();
    }
}