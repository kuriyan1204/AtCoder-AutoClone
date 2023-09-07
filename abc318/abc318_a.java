/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		int z = 0;
		int total = 0;
		for(int i = 0; i <= n; i++){
			if(i == m+(p*z)){
			    total++;
			    z++;
			}
			
		}
		System.out.println(total);
	}
}
