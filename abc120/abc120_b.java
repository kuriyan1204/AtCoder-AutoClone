import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
		    if(a % i == 0 && b % i == 0){
		        arr.add(i);
		    }
		}
		
		System.out.println(arr.get(arr.size() - k));
		
	}
}
