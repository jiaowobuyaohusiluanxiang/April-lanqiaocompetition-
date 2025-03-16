import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class  蓝桥杯真题_货物摆放{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
       for(long i=2;i<=Math.sqrt(n);i++) {
           if(i*i==n) {
               System.out.println(1);
           }

       }

        scan.close();
    }
}