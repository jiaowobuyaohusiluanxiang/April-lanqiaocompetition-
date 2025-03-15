import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<num;i++) {
            String s_find = scan.next();
            if(s_find.equals("find")) {
                String s_author = scan.next();
                if(map.containsKey(s_author)) {
                    System.out.println(map.get(s_author));
                }
                 else {
                    System.out.println(0);
                }

            }
            else {
                scan.next();
                String s_author = scan.next();
                if(map.containsKey(s_author)) {
                    int a = map.get(s_author)+1;
                    map.remove(s_author);
                    map.put(s_author,a);
                }
               else {
                    map.put(s_author,1);
                }
            }

        }
        scan.close();
    }
}