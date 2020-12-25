package Free_Coding_Camp;

import java.util.Scanner;

public class Populate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {};
		String[] names=new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter the input");
			String input=sc.next();
			names[i]=input;
		
		 
		}
		
		System.out.println("Elements in the array");
		for (String element:names)
		{
			
			System.out.println(element);
			if(element.equals("Nupur"))
					{
						break;
					}
		}
	}

}
