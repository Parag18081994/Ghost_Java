package Free_Coding_Camp;

import java.util.ArrayList;

public class List_imp {

	public static void main(String[] args) {
		ArrayList<Integer> t=new ArrayList<Integer>();
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		//t.remove(0);
		
		System.out.println(t.get(0));
		t.set(1, 5);
		System.out.println(t.subList(1, 3));
		System.out.println(t);

	}

}
