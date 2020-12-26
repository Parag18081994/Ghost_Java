package Free_Coding_Camp;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> t=new LinkedList<Integer>();
		
		t.add(1);
		t.add(2);
		t.add(8);
		t.add(33);
		t.add(111);
		t.add(233);
		//t.remove(0);
		
		System.out.println(t.get(0));
		t.set(1, 5);
		System.out.println(t.subList(1, 3));
		System.out.println(t);
		
	}

}
