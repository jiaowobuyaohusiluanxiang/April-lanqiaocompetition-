import java.util.ArrayList;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class  蓝桥杯真题_车牌{
    // static ArrayList list = new ArrayList();
     static int n = 6;
     static int count = 0;//总位数
     static int pre =-1;//上一位数
     static int same =0;//一样的位数和
     static int res = 0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        dfs(count,same,pre);
        System.out.println(res);
        scan.close();
    }
    private static void dfs(int count,int same,int pre) {
        if(same==3) {
            return;
        }
        if(count==n) {
            res++;
            return;
        }

        if(count<3) {
            for(int i=0;i<=15;i++) {
                if(pre == i ){

                    dfs(count+1,same+1,i);
                }
              else {
                  dfs(count+1,1,i);
                }
            }

        }else {
            for(int i=0;i<=9;i++) {
                if(pre == i ){

                    dfs(count+1,same+1,i);
                }
                else {
                    dfs(count+1,1,i);
                }
            }
        }

        }
    }
