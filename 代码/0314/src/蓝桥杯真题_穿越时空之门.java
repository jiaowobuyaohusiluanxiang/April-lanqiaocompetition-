import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_穿越时空之门 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res = 0;
        for(int i=1;i<=2024;i++) {
            if(test(i,2)==test(i,4)){
                res++;
            }
        }
        System.out.print(res);
        scan.close();
    }
    private static  int test(int i,int x) {
        int sum = 0;
        while(i>0) {
            sum += i%x;
            i=i/x;
        }
        return sum;
    }
}//这个也减少了复杂度，通过嵌套函数的方式