import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> bk = new ArrayList<>(n + 1);

        for (int i = 0; i <= n; i++) {
            bk.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int s = sc.nextInt();
            bk.get(f).add(s);
        }

        int res = 0;
        List<Integer> best = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            Collections.sort(bk.get(i), Collections.reverseOrder());

            if (bk.get(i).size() >= 2) {
                res = Math.max(res, bk.get(i).get(0) + bk.get(i).get(1) / 2);
            }

            if (bk.get(i).size() >= 1) {
                best.add(bk.get(i).get(0));
            }
        }

        Collections.sort(best, Collections.reverseOrder());

        if (best.size() >= 2) {
            res = Math.max(res, best.get(0) + best.get(1));
        }

        System.out.println(res);
    }
}
