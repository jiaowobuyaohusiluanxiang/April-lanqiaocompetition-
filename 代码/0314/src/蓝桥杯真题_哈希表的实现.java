import java.util.*;

// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_哈希表的实现 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q =scan.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<q;i++) {
            String s = scan.next();
            int a = scan.nextInt();
            if(s.equals("I")) {
                set.add(a);
            }
            if(s.equals("Q")) {
                if (set.contains(a)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        scan.close();
    }
}