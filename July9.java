
import java.util.HashMap;

public class July9{
    public static void main(String[] args) {
      
        int[]arr={2,7,11,15,3};
        int target=10;

      int[]a= Twosum(arr,target);
      System.out.println(a[0]+" "+a[1]);
    }

    private static int[] Twosum(int[] arr, int target) {
          HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value=target-arr[i];
            if(map.containsKey(value)){
                return new int[]{map.get(value),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}