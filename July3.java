
import java.util.HashMap;

public class July3{
public static void main(String[] args) {
    int[]arr={3,2,1,2,5};
    int k=4;
    countPair(arr,k);
}

    private static void countPair(int[] arr, int k) {
        int cnt=0;
     
       HashMap<Integer,Integer> map=new HashMap<>();
      
        for(int i=0;i<arr.length;i++){
        
            if(map.containsKey(k-arr[i])){
                cnt++;
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(cnt);
    }
}