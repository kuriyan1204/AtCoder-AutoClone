import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int flag = 0;
        for (int i = 0; i < n-2; i++){
            if(s.substring(i, i+3).equals("ABC")){
                flag ++;
            }
        }
        
        System.out.println(flag);
        
    }
}
