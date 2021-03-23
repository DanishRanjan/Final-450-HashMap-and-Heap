import java.util.*;

public class hashMapIntro {
	public static void main(String args[]) throws Exception{
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("india", 135);
		hm.put("china", 200);
		hm.put("pak", 30);
		hm.put("us", 20);
		hm.put("uk", 10);
		
		System.out.println(hm);
		
		hm.put("Nigeria",5);
		hm.put("us",25);
		
		System.out.println(hm);
		
		System.out.println(hm.get("india"));
		System.out.println(hm.get("etopia"));
		
		System.out.println(hm.containsKey("india"));
		System.out.println(hm.containsKey("etopia"));
		
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		for(String key:hm.keySet()) {
			Integer val = hm.get(key);
			System.out.println(key+" "+val);
		}
	}
}
