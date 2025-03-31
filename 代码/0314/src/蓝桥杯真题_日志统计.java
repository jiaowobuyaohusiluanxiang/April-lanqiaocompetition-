import java.util.*;
import java.util.HashSet;
import java.util.Scanner;

public class 蓝桥杯真题_日志统计 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,ArrayList> map = new HashMap<>();
        int n = scan.nextInt();
        TreeSet<Integer> idSet = new TreeSet<>();
        int d = scan.nextInt();//时间
        int k = scan.nextInt();//点赞数
        for(int i=0;i<n;i++) {
            int time = scan.nextInt();
            int id = scan.nextInt();
            if(!map.isEmpty()&&map.containsKey(id)) {
                map.get(id).add(time);
            }else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(time);
                map.put(id, list);
            }
        }

        for(int i:map.keySet()) {//获取点赞时间;按照id遍历
               List<Integer> temp=map.get(i);
               Collections.sort(temp);
               int left =1;
               for(int right=0;right<temp.size();right++) {
                   while(left<temp.size()&&temp.get(left)-temp.get(right)<=d) {
                       left++;
                   }
                   left--;
                   if(left-right+1>=k&&temp.get(left)-temp.get(right)<d) {
                       idSet.add(i);
                       break;
                   }
               }
            }
        for(int i:idSet) {
            System.out.println(i);
        }


        scan.close();
    }
}