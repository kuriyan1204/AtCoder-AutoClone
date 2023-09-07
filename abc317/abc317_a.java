import java.util.*;
public class Main {
    public static void main(String[] args) {
        //方針
        // dfs で探索できる場所を0に変えていく、最終的に戻ってきた時点で探索終了
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int[] potions = new int[n];
        for (int i = 0; i < n; i++) {
          potions[i] = sc.nextInt();
        }

        int potion = 0;
        for (int i = 0; i < n; i++) {
          potion = potions[i];
          if((potion + h) - x >= 0){
            System.out.println(i+1);
            break;
          }
        }
    }
}