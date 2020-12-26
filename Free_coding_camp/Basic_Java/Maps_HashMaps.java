package Free_Coding_Camp;

import java.util.HashMap;
import java.util.Map;

public class Maps_HashMaps {

	public static void main(String[] args) {
		Map m=new HashMap();
		
		m.put("Parag", 5);
		m.put("Nupur", 9);
		m.put("PR", "Canada");
		m.put(11,5);
		
		
		//System.out.println(m.containsValue("b"));
		//System.out.println(m.containsKey(11));
		//System.out.println(m);
		//System.out.println(m.get("Nupur"));
		//System.out.println(m.get("PR"));
		System.out.println(m.values());
	}

}
