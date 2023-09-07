import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            s.add(i);
        }
        
        for (int i = 0; i < M; i++) {
            int win = scanner.nextInt();
            int lose = scanner.nextInt();
            s.remove(lose);
        }
        
        if (s.size() != 1) {
            System.out.println(-1);
        } else {
            System.out.println(s.iterator().next());
        }
    }
}
