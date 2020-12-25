package Free_Coding_Camp;

public class For_each_loops {

	public static void main(String[] args) {
	
		
		int[] arr= {1,2,5,6,7,8,1};
		String[] names=new String[5];
		
		int count=0;
		for(int element:arr) {
			System.out.println(element+" count-"+count);
			count++;
		}

		
	}

}
