package Free_Coding_Camp;

public class For_Loops {

	public static void main(String[] args) {
	
		int x=0;
		
		for (int i=0; i<10 ;i++)
		{
			x+=5;
			//System.out.println(x);
		}
		
		//System.out.println(x);
	
	int[] arr= {1,2,3,4,5};
	
	for(int i=0;i < arr.length;i++)
	{
		if (arr[i]==4)
		{
			System.out.println("Found a 4! at index-"+i);
		}
		System.out.println(arr[i]);
	}
	
	
	}
	
	
	

}
