
import java.util.HashMap;
import java.util.Map;

public class Freqency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
            int[]a={1,1,1,1,5,3,7,2,};
            for(int i=0;i<a.length;i++){
                map.put(a[i], map.getOrDefault(a[i],0)+1);
            }
            for(Map.Entry<Integer,Integer> map1:map.entrySet()){
                System.out.println(map1.getKey()+"->"+map1.getValue());
            }
    }
}
