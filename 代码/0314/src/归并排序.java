import java.util.Scanner;

public class 归并排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int j = 0; j < n; j++) {
            b[j] = scan.nextInt();
        }
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = a[i] - b[i];
        }

        long res = mergeandsort(ai, 0, n - 1);
        System.out.print(res);
        scan.close();
    }

    private static int mergeandsort(int[]ai,int a,int b) {
        int count = 0;//计算有几个符合的
        int left = a;
        int right = b;
        int mid = left+(right-left)/2;//防止溢出
        if(a>=b) {
            return 0;//找到终止点，跳出循环；
        }
        count = mergeandsort(ai,left,mid)+mergeandsort(ai,mid+1,right);
        count +=merge(a,b,mid,ai);
        return count;
    }


    private  static int merge(int a,int b,int mid,int[]ai) {
        int[] left1 = new int[mid-a+1];
        int[] right1 = new int[b-mid];
        System.arraycopy(ai,a,left1,0,left1.length);
        System.arraycopy(ai,mid+1,right1,0,right1.length);
        int i=0,j=0,result=0;
        int r=mid+1;//右指针
        for(int k=a;(k<=mid)&&(r<right1.length);) {
              if(left1[k]+right1[r]>0) {
                  result++;
                  r++;
              }else {
                  k++;
              }
        }//筛选条件
//        while(i<left1.length && j<right1.length) {//开始合并
//            if(left1[i]+left1[j]>0) {
//                result++;
//            }
//        }
        return result;
    }
}