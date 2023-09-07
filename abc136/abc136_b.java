import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		for (int i = 1; i <= n; i++){
		    if(0 < i && i <10){
		        total++;
		    } else if(99 < i && i < 1000){
		        total++;
		    } else if(9999 < i && i < 100000){
		        total++;
		    }
		}

		
		System.out.println(total);
	}
}
