import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class  蓝桥杯真题_小新神秘棋盘{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0;i<num;i++) {
            int a =scan.nextInt();
            int b =scan.nextInt();
            int p =scan.nextInt();
            int q =scan.nextInt();
            if(a == p&& b==q) {
                System.out.println(0);
            }else if((a==p&&b!=q)||(a!=p&&b==q)) {
                System.out.println(1);
            }else if(((a+b)%2==0&&(p+q)%2==0)||((a+b)%2!=0&&(p+q)%2!=0)||((a+b)%2==0&&(p+q)%2!=0)) {
                System.out.println(2);
            }else {
                System.out.println(3);
            }

        }
        scan.close();
    }

}
