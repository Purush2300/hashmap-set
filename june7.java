
import java.util.HashMap;



public class june7 {
    public static void main(String[] args) {
        
        int[]arr={3,2,3};
        int k=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i])>k/2){
                System.out.println(arr[i]);
            }
        }
       
            
   
      
    }

}
