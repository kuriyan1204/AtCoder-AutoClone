import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++) {
          String tmp = sc.next();
            map[i] = tmp.toCharArray();
        }
        

        int startY = 0;
        int startX = 0;
        for (int i = 0; i < N-8; i++) {
          for (int j = 0; j < M-8; j++) {
            startY = i;
            startX = j;
            boolean flag = true;
            //左上の条件
            for (int j2 = startY; j2 < startY+4; j2++) {
              for (int k = startX; k < startX+4; k++) {
                if(j2 == startY+3 || k == startX+3){
                  if(map[j2][k] != '.'){
                    flag = false;
                  }
                } else if(map[j2][k] != '#'){
                  flag = false;
                }
              }
            }

            //右下の条件
            for (int j2 = startY+5; j2 < startY+9; j2++) {
              for (int k = startX+5; k < startX+9; k++) {
                if(j2 == startY+5 || k == startX+5){
                  if(map[j2][k] != '.'){
                    flag = false;
                  }
                } else if (map[j2][k] != '#'){
                  flag = false;
                }
              }
            }

            if(flag){
              System.out.println((i+1) + " " + (j+1));
            }

          }
        }


    }
}
