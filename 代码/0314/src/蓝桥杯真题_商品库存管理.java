import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_商品库存管理 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] L = new int[m];
        int[] M = new int[m];
        for(int i=0;i<m;i++) {
            L[i] = scan.nextInt();
            M[i] = scan.nextInt();
        }
        int[] num=new int[n+1];
        for(int i=0;i<m;i++) {
            for(int j=L[i];j<=M[i];j++){
                num[j]++;
            }
        }
        int zero =0;
        for(int i=1;i<=n;i++) {
            if(num[i]==0) {
                zero++;
            }
        }
        int iszero=0;
        for(int i=0;i<n;i++) {
            for(int j=L[i];j<=M[i];j++) {
                if(num[j]-1==0) {
                    iszero++;
                }
            }
            System.out.println(iszero+zero);
        }
        scan.close();
    }
}