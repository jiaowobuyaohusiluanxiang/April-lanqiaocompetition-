import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class java0404_003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int[] normal = new int[n];
        int[] special = new int[n];
        int conmax = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            normal[i] = scan.nextInt();//normal
            special[i] = scan.nextInt();//special
            conmax = Math.min(conmax,normal[i]/special[i]);//先找到相对最大值
        }
        int realmin = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int conmin = 0;
            for(int j=normal[i]/special[i]-1;j>0;j--) {
                if(normal[i]/j==special[i]) {//开始找是否能合成特殊金属,并判断每一个是否能够大于上一个的最小值
                    if(conmin==0||conmin>j) {//找更小值
                        conmin = j;
                    }
                }
            }
            realmin = Math.max(realmin,conmin);
        }
        System.out.println(realmin+" "+conmax);
        scan.close();
    }
}