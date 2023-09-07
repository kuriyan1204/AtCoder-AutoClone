import java.util.*;
public class Main {
    public static void main(String[] args) {
        //方針
        // 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
          if(arr[i + 1] != arr[i] + 1){
            System.out.println(arr[i] + 1);
          }
        }
    }
}