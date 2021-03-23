import java.util.*;

public class HighestFrequency {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(hm.containsKey(ch)) {
				int oldFrequency = hm.get(ch);
				int newFrequency = oldFrequency + 1;
				hm.put(ch, newFrequency);
			}else {
				hm.put(ch, 1);
			}
		}
		
		char maximumFrequencyCharacter = str.charAt(0);
		for(Character key : hm.keySet()) {
			if(hm.get(key) > hm.get(maximumFrequencyCharacter)) {
				maximumFrequencyCharacter = key;
			}
		}
		System.out.println(maximumFrequencyCharacter);
	}
}
