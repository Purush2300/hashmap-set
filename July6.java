
import java.util.HashSet;

public class July6 {
    public static void main(String[] args) {
       String s="abcabc";
       HashSet <Character> set=new HashSet<>();
       int i=0;
       int len=0;
       for(int j=0;j<s.length();j++){
            if(!set.contains(s.charAt(j))){
        

            }
             while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
                    set.add(s.charAt(j));
                len=Math.max(len, j-i+1);
            
       }
       System.out.println(len);
       
    }
}
