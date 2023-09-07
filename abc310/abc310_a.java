import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int minPay = p;
        for (int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            if(minPay > tmp + q){
                minPay = tmp + q;
            }
        } 
        
        System.out.println(minPay);
    }
}
