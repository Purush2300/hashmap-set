import java.util.*;
public class New2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[]nums={1,2,1,2,1,2,3,1,3,2};
        int k=2;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
           if( map.size()==k){
            System.out.println(map.keySet());
            return;
            }
        }
       
    }
}
