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
		int total = 0;
		for (int i = 1; i < n+1; i++){
		    List<Integer> nums = new ArrayList<>();
		    for (int j = 1; j*j < i; j++){
		        if(i % 2 != 0 && i % j == 0 && i != j){
		            nums.add(j);
		            nums.add(i / j);
		        }
		    }
		    if(nums.size() == 8){
		        total++;
		    }
		}
		
		System.out.println(total);
	}
}
