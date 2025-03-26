import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_快速幂 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long b = scan.nextInt();
        long p = scan.nextInt();
        long k = scan.nextInt();
        long r=1;
        if(b==0) {
            System.out.print(b);
        }
        else{while(p!=0) {
            b=b%k;
            if((p%2)==1) {
                r=(b*r)%k;
            }
            b=(b*b)%k;
            p=p/2;
        }
            System.out.print(r);
            scan.close();
        }}

}