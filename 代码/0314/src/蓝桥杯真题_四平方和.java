import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_四平方和 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int f= 1;
        for(long i=0;i<n/2;i++) {
            if(f==0) {
                break;
            }
            for(long j=0;j<n/2;j++) {
                if(f==0) {
                    break;
                }
                for(long k=0;k<n/2;k++) {
                    if(f==0) {
                        break;
                    }
                    long l=n-(i*i+j*j+k*k);
                        if(l==0) {
                            System.out.println((int)Math.sqrt(l)+" "+i+" "+j+" "+k+" ");
                            f=0;
                            break;
                    }
                }
            }
        }
        scan.close();
    }
}