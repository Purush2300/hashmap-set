import java.util.*;
public class First {
    public static void main(String[] args) {
      HashSet<Integer> s=new HashSet<>();
      int []a={1,2,3,1};
      for (int i = 0; i < a.length; i++) {
        s.add(a[i]);
         System.out.println(s.size()); 
      }
      
    }
}
