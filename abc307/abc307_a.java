import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0){
		    int total = 0;
		    for (int i = 0; i < 7; i++){
		       total += sc.nextInt();
		    }
		    System.out.print(total + " ");
		    n--;
		}
	}
}
