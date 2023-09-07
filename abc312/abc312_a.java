import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] strs = {"ACE","BDF","CEG","DFA","EGB","FAC","GBD"};
        boolean findFlag = false;
        for (int i = 0; i < strs.length; i++) {
          if(strs[i].equals(S)){
            findFlag = true;
          }
        }

        if(findFlag){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }

    }
}
