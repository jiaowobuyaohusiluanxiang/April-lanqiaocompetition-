import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 蓝桥杯真题_分巧克力 {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//N块巧克力
        int K=sc.nextInt();//K个小朋友
        int [][] arr=new int[N][2];
        for(int i=0;i<N;i++) {
            for(int j=0;j<2;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int length=1;//切的长度
        long temp1=0;//切出巧克力的数量
        while(flag) {
            int i;
            for(i=0;i<N;i++) {
                temp1+=(arr[i][0]/length)*(arr[i][1]/length);
                if(temp1>=K) {//temp1为切出巧克力的数量大于K时，跳出for循环
                    break;//跳出这个循环
                }
            }
            if(i==N&&temp1<K) {//当所有巧克力都切完并且temp1(切出的数量)小于K个小朋友时跳出while
                flag=false;
            }else {
                length++;
                temp1=0;
            }
        }
        System.out.println(length-1);//length为不满足条件时的数量，所以要减一
        sc.close();

    }
}