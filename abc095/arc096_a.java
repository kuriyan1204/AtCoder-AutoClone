import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long X = scanner.nextLong();
        long Y = scanner.nextLong();
        
        long ans = Long.MAX_VALUE;
        for (int ab = 0; ab <= 201010; ab++) {
            long sm = C * ab;
            
            long x = X - ab / 2;
            long y = Y - ab / 2;
            
            if (x > 0) sm += x * A;
            if (y > 0) sm += y * B;
            
            ans = Math.min(ans, sm);
        }
        
        System.out.println(ans);
    }
}
