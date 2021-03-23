import java.util.*;

public class getCommonElement1{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for(int i=0;i<n1;i++){
        arr1[i] = sc.nextInt();
    }
    
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
        arr2[i] = sc.nextInt();
    }
    
    HashMap<Integer,Integer> fmap = new HashMap<>();
    for(int i=0;i<n1;i++){
        if(fmap.containsKey(arr1[i])){
            int of = fmap.get(arr1[i]);
            int nf = of + 1;
            fmap.put(arr1[i],nf);
        }else{
            fmap.put(arr1[i],1);
        }
    }
    
    for(int i=0;i<n2;i++){
        if(fmap.containsKey(arr2[i])){
            System.out.println(arr2[i]);
            fmap.remove(arr2[i]); 
        }
    }
    
 }

}