import java.util.*;
public class Main {
    public static void main(String[] args) {
        //方針
        // 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] player = new int[n];

        
        ArrayList<ArrayList<Integer>> bets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
          player[i] = sc.nextInt();
          ArrayList<Integer> bet = new ArrayList<>();
          for (int j = 0; j < player[i]; j++) {
            bet.add(sc.nextInt());
          }
          bets.add(bet);
        }

        int x = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
          if(bets.get(i).contains(x)){
            if(min > player[i]){
              result.clear();
              min = player[i];
              result.add(i);
            } else if(min == player[i]){
              result.add(i);
            }
            
          }
        }
        
        
        if(result.size() != 0){
          System.out.println(result.size());
          for (Integer k: result) {
            System.out.println(k+1);
          }
        } else {
          System.out.println(result.size());
        }
    }
}