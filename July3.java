
import static java.lang.Math.abs;
import java.util.HashMap;

public class July3{
public static void main(String[] args) {
    int[]arr={1,2,3,1,2,3};
    int k=2;
    System.out.println(countPair(arr,k));
}

    private static boolean  countPair(int[] arr, int k) {
       
     
       HashMap<Integer,Integer> map=new HashMap<>();
      
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int prev=map.get(arr[i]);
                if(abs(i-prev)<=k){
                    return true;
                }
            }
        map.put(arr[i],i);
        }
        return false;
    }
}