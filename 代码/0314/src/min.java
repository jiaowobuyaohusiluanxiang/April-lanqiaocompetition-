import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 20230610;
        int sum = 0;
        int height = 1;
        int k = 0;
        int i=1;
        while(n!=sum) {
         int m =  test(k,i);
            sum = sum+m;
            height++;
            k++;
            i++;
        }
        System.out.print(height);
        scan.close();
    }
    private static  int test(int k,int i) {
            k = i + k;
return k;
    }
}