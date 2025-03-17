import java.util.Scanner;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_货物摆放 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList();
        long n =2021041820210418l;
        long res = 0;
        long sum = 0;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum++;
                list.add(i);
            }
            long m = n/i;//根号后
            if(m!=i&&(m*i)==n) {
                sum++;
                list.add(m);
            }
        }
       // System.out.println(sum);
        for(Object i:list) {
            for(Object j:list) {
                for(Object k:list) {
                    if((long)i *(long)j*(long)k==n) {
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
        scan.close();
    }
}