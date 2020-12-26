package Free_Coding_Camp;

import java.util.Scanner;

public class OOPS_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//sc.next();
		//String h="hello";
		//int x=h.length();
		//System.out.println(x);
		//System.out.println(h.length());
		tim("Timmy",4);
		System.out.println(add2(10));
		System.out.println(str("Parag"));
	}

public static void tim(String str,int x)
{
	for (int i=0;i<=x;i++)
	{
		System.out.println(str+" Age "+x);
	}
	

	
}

public static int add2(int x)
{
return x+2;	
}

public static String str(String x)
{
	return x+"!";
}

}
