import java.util.Scanner;
import java.util.*;

import static jdk.nashorn.internal.objects.NativeString.lastIndexOf;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_分布式队列 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer,ArrayList> map = new HashMap<>();
        map.put(0,new ArrayList<>());
        for(int i = 1;i<n;i++) {
            map.put(i,new ArrayList<>());
        }//节点创造好了后
         do{
             String str = scan.next();//nextLine 是一整行！！
             if(str.equals("add")) {
                 int a = scan.nextInt();
                 map.get(0).add(a);
             }
             if(str.equals("query")) {
                 int sum = Integer.MAX_VALUE;
                 for(int i=1;i<n;i++) {
                     int sum1 = map.get(i).size();
                     sum =Math.min(sum,sum1);
                 }
                 System.out.println(sum);
             }
             if(str.equals("sync")) {
                 int a = scan.nextInt();
                 ArrayList<Integer> mainlist = map.get(0);
                 ArrayList<Integer> deputylist = map.get(a);
                 for(int i:mainlist) {
                     if (!deputylist.contains(i)) {
                         deputylist.add(mainlist.get(0));
                         break;
                     }
                 }
             }
         }while(scan.hasNext());

        scan.close();
    }
}