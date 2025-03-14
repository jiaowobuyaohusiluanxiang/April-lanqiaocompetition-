import java.util.Scanner;


// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t,A,B =0;
        t = scan.nextInt();
        for (int i=0;i<t;i++) {
            A = scan.nextInt();
            B = scan.nextInt();
            //负数整除知识！
            int res = A%B;
            if (res>=0) {
                System.out.println(res);
            }
            else  System.out.println(res+Math.abs(B));
        }

        scan.close();
    }
}




import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int result = A % B;

            if (result < 0) {
                result += Math.abs(B);
            }

            System.out.println(result);
        }

        scan.close();
    }
}