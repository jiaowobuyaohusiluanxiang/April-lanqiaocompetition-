import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_神秘数对 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,k,res=0;
        n = scan.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if((a[i]+3)*(a[j]-4)==8) {
                    res ++;
                }
            }
        }
        System.out.println(res);
        scan.close();
    }
}