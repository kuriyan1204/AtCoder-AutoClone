import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int maxCount = 0;
        boolean flag = false;
        
        for (int i = 0; i < s.length(); i++){
            int count = 0;
            for (int j = i; j < s.length(); j++){
                //System.out.println(s.substring(j, j+1));
                if(s.substring(j, j+1).equals("A") ||
                   s.substring(j, j+1).equals("C") ||
                   s.substring(j, j+1).equals("G") ||
                   s.substring(j, j+1).equals("T") ){
                       count++;
                } else {
                    break;
                }
            } 
            maxCount = Math.max(maxCount, count);
           // System.out.println(count);

        } 
        
        
      System.out.println(maxCount);
        
    }
}
