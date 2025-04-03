import java.util.Scanner;


// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_AB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t>0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(Math.abs(a)%Math.abs(b)==0) {
                System.out.println(a%b);
            }else if(a>0&&b<0) {
                System.out.println((a)-(a/b)*b);
            }else if(a<0&&b>0) {
                System.out.println(a-(a/b-1)*b);
            }else if(a<0&&b<0){
                System.out.println(a-(a/(-b)-1)*(-b));
            }else {
                System.out.println(a%b);
            }
            t--;
        }
        scan.close();
    }
}