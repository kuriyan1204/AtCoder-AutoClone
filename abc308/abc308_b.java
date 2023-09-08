import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] eat = new String[n];
        for (int i = 0; i < n; i++){
            eat[i] = sc.next();
        }
        String[] dishes = new String[m];
        for (int i = 0; i < m; i++){
            dishes[i] = sc.next();
        } 
        int otherPrice = sc.nextInt();
        
        int[] price = new int[m];
        for (int i = 0; i < m; i++){
            price[i] = sc.nextInt();
        }
        
        int total = 0;
        for (int i = 0; i < n; i++){
            boolean flag = false;
            for (int j = 0; j < m; j++){
                if(eat[i].equals(dishes[j])){
                    total += price[j];
                    flag = true;
                }
            } 
            if(!flag){
                total += otherPrice;
            }
        }
        
        System.out.println(total);
        
    }
}



