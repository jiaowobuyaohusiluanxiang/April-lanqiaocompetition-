import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class mm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n+1];
        for(int i=0,j=1;i<n;i++,j++) {
            array1[i] = scan.nextInt();
            array2[j] = array1[i]+array2[j-1];

       }
        for(int i=1;i<=q;i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            sum = array2[r] - array2[l - 1];
            System.out.println(sum);
            sum = 0;
        }
        scan.close();
      }
    }

//    private static int add( int l, int r, int[] array1) {
//        int sum =0;
//        int minus =0;
//        for(int i=0;i<r;i++) {
//            sum=sum+array1[i];
//        }
//        for(int i=0;i<l-1;i++) {
//            minus =minus+array1[i];
//        }
//        return sum-minus;
//    }
