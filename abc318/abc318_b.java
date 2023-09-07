/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] map = new boolean[101][101];
		for (int i = 0; i < n; i++) {
		    int A = sc.nextInt();
		    int B = sc.nextInt()-1;
		    int C = sc.nextInt();
		    int D = sc.nextInt()-1;
		    for (int y = A; y <= B; y++){
		        for (int x = C;  x <= D; x++){
		            map[y][x] = true;
		        } 
		    } 
		}
		int total = 0;
		for (int i = 0; i < 100; i++) {
		    for (int j = 0; j < 100; j++){
		        if(map[i][j]){
		            total++;
		        }
		    } 
		    
		}
		System.out.println(total);
	}
}
