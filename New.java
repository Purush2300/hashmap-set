import java.util.*;

public class New {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[]nums={3,2,3};
        int k=nums.length;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
            if(map.get(nums[i])>k/2){
                System.out.println(nums[i]);
            }
    }
    
    }
}
