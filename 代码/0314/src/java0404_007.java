import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class java0404_007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String s = scan.next();
        String a = scan.next();
        String b = scan.next();
        int count = 0;//记录总个数
        for(int i=0;i<s.length();i++){
            String first = s.substring(i,i+1);
            if(first.equals(a)) {
                for(int j=i+3;j<s.length();j++){
                    if (s.substring(j,j+1).equals(b) &&  j-i+1>= k) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        scan.close();
    }
}