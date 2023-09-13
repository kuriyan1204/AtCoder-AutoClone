import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++){
		    result.append(s.charAt(i));
		    result.append(s.charAt(i));
		}
		
		System.out.println(result.toString());
	}
}
