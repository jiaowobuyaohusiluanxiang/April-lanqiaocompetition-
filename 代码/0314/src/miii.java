import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class miii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum =0;
        for(int i=1;i<=43;i++) {
            sum =i +sum;
        }
        sum = sum+43*7;
        System.out.println(sum);
        scan.close();
    }
}