import java.util.*;
public class First1 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        // map.put(100, 6);
        // map.put(1000, 2);
        // map.put(200, 3);
        // map.getOrDefault(100, 0);
        // map.containsKey(100);
        // map.size();
        // System.out.println(map.containsKey(100));
        // System.out.println(map.size());
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], i);
            System.out.println(map);
        }
    }
}
