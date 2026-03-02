import java.util.*;

public class New {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[]a={3,2,3};
        int k=a.length;
        for (int i = 0; i < a.length; i++) {
            map.put(a[i],i);
            if(map.get(a[i])>k/2){
                System.out.println(a[i]);
            }
    }
    
    }
}
