import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] field = new char[n][n];
		for (int i = 0; i < n; i++){
		    String str = sc.next();
		    field[i] = str.toCharArray();
		}
		
		char[][] ans = new char[n][n];
		
		for (int i = 0; i < n; i++){
		    for (int j = 0; j < n; j++){
		        if(i == 0 && j < n-1){
		            ans[i][j+1] = field[i][j];
		        } else if(i < n-1 && j == n-1){
		            ans[i+1][j] = field[i][j];
		        } else if(i == n-1 && j > 0){
		            ans[i][j-1] = field[i][j];
		        } else if(i > 0 && j == 0){
		            ans[i-1][j] = field[i][j];
		        } else {
		            ans[i][j] = field[i][j];
		        }
		    }
		} 
		
		for (int i = 0; i < n; i++){
		    for (int j = 0; j < n; j++){
		        System.out.print(ans[i][j]);
		    }
		    System.out.println();
		} 
		
	}
}
