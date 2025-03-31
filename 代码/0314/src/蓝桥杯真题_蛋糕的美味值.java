import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_蛋糕的美味值 {
    static int maxsum = 0;
    static int n ;
    static int k ;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        k=scan.nextInt();

        int[] a =new int[n];
        for(int i=0;i<n;i++) {
            a[i]= scan.nextInt();
        }
            dfs(a,0,0);

        System.out.println(maxsum);
        scan.close();
    }
    private static void dfs(int[] a,int sum,int index) {
       if(index==n) {//已经遍历完蛋糕
           if(sum<k&&sum>maxsum) {
               maxsum = sum;
           }
           return;
       }

       if(sum+a[index]<k) {
           dfs(a,sum+a[index],index+1);
       }
       dfs(a,sum,index+1);//不满足，超过了直接跳下一个

    }
}