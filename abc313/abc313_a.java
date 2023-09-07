import java.util.*;
  public class Main {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
        
          int person = sc.nextInt();
          int saikyo = person;
          boolean saikyoFlag = true;
          for (int i = 0; i < N-1; i++) {
            int tmp = sc.nextInt();
            if(tmp >= saikyo){
              saikyo = tmp;
              saikyoFlag = false;
            }
          }
          if(saikyoFlag){
            System.out.println(0);
          } else {
            System.out.println(saikyo - person + 1);
          }
          
      }
  }