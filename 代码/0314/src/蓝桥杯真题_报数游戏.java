import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_报数游戏 {
    static long count = 202420242024l;
    static long res = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       dfs(1);
        scan.close();
    }
    private static void dfs(int i) {
        if(res==count) {
            System.out.println(i);
            return;
        }
       long m =i*20;
        long n = i*24;
        if(m%24==0||n%20==0) {
            res+=1;
        }else {
            res+=2;
        }
        dfs(i+1);
    }
}