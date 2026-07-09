
import java.util.HashMap;
import java.util.Scanner;

public class July9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashMap<Integer,Integer> map=new HashMap<>();
      int[]arr={1,1,2,2,2};
      int max=0;
      for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
          int prev=i-map.get(arr[i]);
       
          max=Math.max(max, prev);
        }
        if(!map.containsKey(arr[i])){
          map.put(arr[i],i);
        }
      }
      System.out.println(max);
    }

   
}