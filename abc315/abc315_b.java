import java.util.*;
public class Main {
    public static void main(String[] args) {
        //方針
        // 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] month = new int[n];
        int[] sum = new int[n + 1];
        int total = 0;
        for (int i = 0; i < n; i++) {
          month[i] = sc.nextInt();
          total += month[i];
          sum[i+1] = month[i] + sum[i];
        }

        int sep = total / 2;
        for (int i = 0; i < n+1; i++) {
          if(sep < sum[i]){
            System.out.println(i);
            System.out.println(sep - sum[i-1] + 1);
            break;
          }
        }
    }
}