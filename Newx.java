import java.util.*;


public class Newx {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int []a={1,1,2,2,2,2,3,4};
        int find=2;
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0)+1);







        }
        if(map.containsKey(find)){
            System.out.println(map.get(find));
        }























    }
}
