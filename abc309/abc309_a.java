import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		//条件 B-A == 1 かつ Bが右列(３で割り切れる) または 左列(３で割って一あまる)
		if(B - A == 1 && (B % 3 == 0 || A % 3 == 1)){
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
	}
}
