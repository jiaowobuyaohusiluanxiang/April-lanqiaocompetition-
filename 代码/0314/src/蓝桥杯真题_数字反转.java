import java.util.Scanner;

public class 蓝桥杯真题_数字反转 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 0) {
            StringBuilder string = new StringBuilder();
            string.append(n);
            System.out.println(Integer.valueOf(String.valueOf(string.reverse())));
        } else {
            int newn = isint(n);
            int m = -newn;
            StringBuilder string = new StringBuilder(m);
            string.append(m);
            System.out.println("-" + string.reverse());
        }
        scan.close();
    }

    private static int isint(int n) {
        for (int i = 0; i < 9; i++) {
            if (n % 10 == 0) {
                n = n / 10;
            } else {
                break;
            }
        }
        return n;
    }
}