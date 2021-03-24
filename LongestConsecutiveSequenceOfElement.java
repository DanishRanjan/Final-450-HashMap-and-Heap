import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
  	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
	HashMap<Integer,Boolean> hm = new HashMap<>();
	for(int val : arr) {
		hm.put(val, true);
	}
	
	for(int val: arr) {
		if(hm.containsKey(val-1)) {
			hm.put(val, false);
		}
	}
	
	int maxStartPoint = 0;
    int maxLength = 0;
    for(int val : arr){
       if(hm.get(val) == true){
           int tempLength = 1;
           int tempStartPoint = val;
			
			while(hm.containsKey(tempStartPoint + tempLength)) {
				tempLength++;
			}
			
			 if(tempLength > maxLength) {
		    	  maxLength = tempLength;
		    	  maxStartPoint = tempStartPoint;
		       }
		}
      
	}
    for(int i = 0 ; i<maxLength;i++) {
    	System.out.println(maxStartPoint + i);
    }
 }

}