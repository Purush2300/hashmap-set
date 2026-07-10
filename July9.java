
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class July9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        String s="abc";
       
      
        for(int i=0;i<s.length();i++){
         map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
System.out.println(map);
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            Character key = en.getKey();
            Integer val = en.getValue();
            int size=val;
            if(size==1){
            
              System.out.println(key);
              return;
             
            }
            
            
        }
      
              System.out.println("all are repeted");
             
            
     
     
    }

   
}