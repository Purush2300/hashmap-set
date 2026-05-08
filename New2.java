import java.util.*;
public class New2 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
       String a="aabbaaccc";
       for (int i = 0; i < a.length(); i++) {
        char c=a.charAt(i);
        map.put(c, map.getOrDefault(c, 0)+1);
       }
       System.out.println(map);
       
    }
}
