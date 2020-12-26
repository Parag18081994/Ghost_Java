package Free_Coding_Camp;

import java.util.HashSet;
import java.util.Set;

public class Sets_imp {

	public static void main(String[] args) {
		
		Set<Integer> t=new HashSet<Integer>();
		t.add(5);
		t.add(8);
		t.add(6);
		t.add(-6);
		t.add(5);
		t.remove(-6);
		//t.clear();  clears the set
		int y=t.size();
		
		boolean x=t.contains(5);
		System.out.println(x);
		
		System.out.println(t);
		System.out.println(y);
		
	
	
	}

}
