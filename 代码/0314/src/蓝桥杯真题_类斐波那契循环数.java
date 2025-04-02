import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_类斐波那契循环数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =197;
        for(int i=197;i<1e7;i++) {
            if(check(i)) {
               n = i;
            }
        }
        System.out.println(n);
        scan.close();
    }
    private static boolean check(int i) {
        String str = i+"";
        ArrayList<Integer> list = new ArrayList<>();//字符串是从左到右
        Deque<Integer> a =new ArrayDeque<>();
        int sum = 0;
        for(int j=0;j<str.length();j++) {//这种操作方式就能轻易解决查找每一位，并记录每一位的和
            //System.out.println(str.charAt(j));
            list.add(str.charAt(j)-'0');
            sum = sum + list.get(j);
        }
         list.add(sum);
        while(true) {//获取下一个元素
            sum = sum*2-list.get(0);
            list.remove(0);
            list.add(sum);
            if(sum ==i) {
                return true;
            }else if(sum>i){
                 return false;
            }
        }

    }
}