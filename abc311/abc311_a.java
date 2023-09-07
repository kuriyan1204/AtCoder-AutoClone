import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] str = new char[N];
        str = sc.next().toCharArray();
        boolean Aflag = false;
        boolean Bflag = false;
        boolean Cflag = false;
        for (int i = 0; i < N; i++) {
          if(str[i] == 'A'){
            Aflag = true;
          }
          if(str[i] == 'B'){
            Bflag = true;
          }
          if(str[i] == 'C'){
            Cflag = true;
          }
          if(Aflag && Bflag && Cflag){
            System.out.println(i+1);
            break;
          }
        }
    }
}