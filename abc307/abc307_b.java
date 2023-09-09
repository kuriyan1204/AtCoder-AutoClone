import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strs = new String[n];
		for (int i = 0; i < n; i++){
		    strs[i] = sc.next();
		}
		
		boolean flag = false;
		for (int i = 0; i < n; i++){
		    for (int j = 0; j < n; j++){
		        if(i != j){
		            StringBuilder tmp = new StringBuilder();
		            tmp.append(strs[i]);
		            tmp.append(strs[j]);
		            String normal = tmp.toString();
		            String reverse = tmp.reverse().toString();
		            if(reverse.equals(normal)){
		                flag = true;
		            }
		            //System.out.println(normal + " "+ reverse);
		        }
		        
		    }
		}
		
		if(flag){
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
		
	}
}
