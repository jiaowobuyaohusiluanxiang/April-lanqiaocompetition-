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
        Map<Integer,Integer> map = new HashMap<>();
        k = scan.nextInt();
        for(int i=0 ;i<n;i++) {
            a[i] = scan.nextInt();
        }
        //通过化简得出 （ai-4）（aj+3）=k；
        for(int i=0 ;i<n ;i++) {
            if (a[i] - 4 == 0) {
                if (k == 0) {
                    res = i + res;
                    }
                } else
                      {
                    if (k % (a[i] - 4) == 0) {
                        //寻找到合理的aj
                        int target = k / (a[i] - 4); //找到专属于这个a【i】的a【j】,为前面配对，作为a【j】
                        res = res + map.getOrDefault(target, 0);//先加res，再加key++
                    }
                }

                int key = a[i] + 3;//为后面配对，作为a【i】
                map.put(key, map.getOrDefault(key, 0) + 1);

            }

        System.out.print(res);
        scan.close();
    }
}