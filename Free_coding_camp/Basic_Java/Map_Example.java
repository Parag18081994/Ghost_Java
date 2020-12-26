package Free_Coding_Camp;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {

	public static void main(String[] args) {
	
		
		Map m =new HashMap();
		
		String str="Hello my name is parag and i am cool";
		//System.out.println(str.toCharArray());
		
		for(char x:str.toCharArray()) {
			
			if (m.containsKey(x))
			{
				int old=(int) m.get(x);
				m.put(x, old+1);
			}
			else
			{
				m.put(x, 1);
			}
			
			
		}
		
		System.out.println(m);

	}

}
