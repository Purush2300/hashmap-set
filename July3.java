
import java.util.HashMap;



public class July3{
public static void main(String[] args) {
    int[]arr={1,2,4,3,2,1};
    int k=3;
    int cnt=0;
   HashMap <Integer,Integer>map=new HashMap<>();
int prefix=0;
map.put(0,1);
for(int i=0;i<arr.length;i++){
    prefix+=arr[i];
    if(map.containsKey(prefix-k)){
        cnt+=map.get(prefix-k);
    }
    map.put(prefix, map.getOrDefault(prefix, 0) + 1);
}
     
  System.out.println(cnt);

}
}