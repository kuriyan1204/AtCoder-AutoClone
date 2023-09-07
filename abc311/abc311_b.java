import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        char[][] S = new char[N][D];
        for (int i = 0; i < N; i++) {
          String tmp = sc.next();
          S[i] = tmp.toCharArray();
        }

        boolean continueFlag = false;
        int maxVacation = 0;
        int subTotal = 0;
        boolean lastFlag = false;
        for (int i = 0; i < D; i++) {
          boolean isOK = true;
          for (int j = 0; j < N; j++) {
            if(S[j][i] == 'x'){
              isOK = false;
            }
            if(i == D-1){
              lastFlag = true;
            }
          }

          if(isOK){
            subTotal++;
            continueFlag = true;
          } else {
            continueFlag = false;
          }

          if(!continueFlag || lastFlag){
            maxVacation = Math.max(maxVacation, subTotal);
            subTotal = 0;
          }
        }

        System.out.println(maxVacation);
    }
}