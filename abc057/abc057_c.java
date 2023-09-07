import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mindig = 100000;
        long b = 0;
        for (long a = 1; a * a <= n; a++){
            if(n % a == 0){
                b = n / a;
                int digit = 0;
                long tmp = Math.max(a, b);
                while(tmp > 0){
                    tmp /= 10;
                    digit++;
                }
                mindig = Math.min(mindig, digit);
            }
            
        } 
        
        System.out.println(mindig);
    }
}
