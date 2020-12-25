package Free_Coding_Camp;

public class Condition_Bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=6;
		String x1="hello";
		String y1="Hi";
		int y=7;
		int z=10;
		//boolean compare=x>y || z<y;
		//boolean compare=x1!=y1;
		
		boolean compare=(x<y && y>z)||(z<x && y!=x);
		System.out.println(compare);
		
		
		
		
	}

}
