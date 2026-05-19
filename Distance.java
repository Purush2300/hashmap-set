
import java.util.HashMap;

public class Distance {
    public static void main(String[] args) {
        int[]a={2,3,1,9,19,3,5,4,3,1};
        int k=2;
        if(checkofdistance(a,k)){
            System.err.println("they two are equal"+k);
        }
        else{
            System.err.println("not equal"+k);
        }

    }

    private static boolean checkofdistance(int[] a, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<a.length;i++){
        if(map.containsKey(a[i]) && i-map.get(a[i])<=k){
            return true;
        }
        map.put(a[i], i);
       }
       return false;
    }
}
