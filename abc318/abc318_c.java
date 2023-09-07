  import java.util.*;
  public class Main {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          int D = sc.nextInt();
          long P = sc.nextLong();

          long[] arr = new long[N];
          long[] prefixSum = new long[N];

          for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
          }

          Arrays.sort(arr);

          //受け取った値の配列を昇順にソートしてprefixSumの塁積和の配列を作成する
          prefixSum[0] = arr[0];
          for (int i = 0; i < N-1; i++) {
            prefixSum[i+1] = prefixSum[i] + arr[i+1];
          }

          //すべての日程で購入できる上限をgroupとして格納
          //上限から減らしていく考えで、
          //prefixSum[N - 1 - (i * D)]：周回チケットを購入しないときのiまでの合計
          //(i * P)                   ：周回チケットを購入したときのiまでの合計
          int group = (N + D - 1)/ D;
          long result = P * group;
          for (int i = 0; i < group; i++) {
            result = Math.min(result, prefixSum[N - 1 - (i * D)] + (i * P));
          }

          System.out.println(result);
      }
  }