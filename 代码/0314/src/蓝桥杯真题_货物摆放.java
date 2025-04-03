import java.util.*;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_货物摆放 {
        static int res = 0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long i = 1;
        List<Long> array = new ArrayList();
        while (i<=Math.sqrt(n)) {
            if(n%i==0) {
                array.add(i);
                array.add(n/i);
                //System.out.println(i);
            }
            i++;
        }
       for(long k:array) {
           for(long m:array) {
              long km = k*m;
              if(n%km!=0) {
                  continue;
              }
              if(n%km==0) {
                  long num = n/km;
                  if(array.contains(num)) {
                      res++;
                  }
              }

           }
       }
        System.out.println(res);
        scan.close();
    }

}