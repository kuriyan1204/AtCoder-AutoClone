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
		boolean flag = false;
		for(int i = 1; i < 10; i++){
		    for (int j = 1; j < 10; j++){
		        if(i * j == n){
		            flag = true;
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
