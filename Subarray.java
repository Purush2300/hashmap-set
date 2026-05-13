import java.util.HashMap;

public class Subarray {
 public static void main(String[] args) {
    HashMap<Character, Character> map1=new HashMap<>();
    HashMap<Character, Character> map2=new HashMap<>();
    String s="foo";
    String t="bag";

    for(int i=0;i<s.length();i++){
        char c1=s.charAt(i);
        char c2=t.charAt(i);
        if(map1.containsKey(c1)){
            if(map1.get(c1)!=c2){
               System.err.println("false");
               return;
            }
        }
        else{
            map1.put(c1, c2);
        }

        if(map2.containsKey(c2)){
            if(map2.get(c2)!=c1){
               System.err.println("false");
               return;
            }
        }
        else{
            map2.put(c2, c1);
        }




    }

System.err.println("true");
return;




 }   
}
