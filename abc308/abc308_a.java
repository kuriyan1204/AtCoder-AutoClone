import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int[] list = new int[8];
        for (int i = 0; i< 8 ;i++){
            list[i] = sc.nextInt();
        } 
        
        
        boolean flag = true;
        int prev = list[0];
        for (int i = 0; i< 8 ;i++){
            if(prev > list[i]){
                flag = false;
            }
            if(!(100 <= list[i] && list[i] <= 675)){
                flag = false;
            }
            if(!(list[i] % 25 == 0)){
                flag = false;
            }
            prev = list[i];
            
        } 
        
        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}



