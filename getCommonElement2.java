import java.util.*;

public class getCommonElement2{

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
     for(int val : arr1){
        if(fmap.containsKey(val)){
            int of = fmap.get(val);
            int nf = of + 1;
            fmap.put(val,nf);
        }else{
            fmap.put(val,1);
        }
    }
    
    for(int val : arr2){
        if(fmap.containsKey(val) && fmap.get(val)>0){
            System.out.println(val);
            int of = fmap.get(val);
            int nf = of - 1;
            fmap.put(val,nf);
        }
    }
 }

}