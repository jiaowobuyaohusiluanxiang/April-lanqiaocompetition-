
public class demo01 {
        public static void main(String[] args) {
            long n = 2021041820210418l;
            long sum = 0;
            for (long i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    sum++;
                }
                long m = n/i;//根号后
                if(m!=i&&(m*i)==n) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
}
