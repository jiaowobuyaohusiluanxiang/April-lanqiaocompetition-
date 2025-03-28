import java.util.*;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_小朋友崇拜圈 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> a = new LinkedList<>();
        for(int i=0;i<n;i++) {
            a.add(scan.nextInt());
        }
        int res = 0;

            int ress = dfs(a.get(0),res,a);
        System.out.println(ress);
        scan.close();
    }
    private static int dfs(int num,int res,List<Integer> a) {
        if(!a.contains(num)) {
            return res;
        }
        if(num == 1 && a.contains("3")) {
            res++;
            a.remove(num);
            dfs(3,res,a);
        }
        if(num == 2 && a.contains(4)) {
            res++;
            a.remove(num);
            dfs(4,res,a);
        }
        if(num == 3 && a.contains(2)) {
            res++;
            a.remove(num);
            dfs(2,res,a);
        }
        if(num == 4 && a.contains(5)) {
            res++;
            a.remove(num);
            dfs(5,res,a);
        }
        if(num == 5 && a.contains(3)) {
            res++;
            a.remove(num);
            dfs(3,res,a);
        }
        if(num == 6 && a.contains(8)) {
            res++;
            a.remove(num);
            dfs(8,res,a);
        }
        if(num == 7 && a.contains(3)) {
            res++;
            a.remove(num);
            dfs(7,res,a);
        }
        if(num == 8 && a.contains(6)) {
            res++;
            a.remove(num);
            dfs(6,res,a);
        }
        if(num == 9 ) {
            res++;
            a.remove(num);
            return res;
        }
        return 0;

    }
}