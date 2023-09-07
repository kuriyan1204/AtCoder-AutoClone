import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int sum = 0;
		for (int i = 0; i < n-1; i++){
		    sum += arr[i];
		}
		
		if(arr[n-1] < sum){
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
		
	}
}
