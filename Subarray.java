import java.util.HashMap;

public class Subarray {
 public static void main(String[] args) {
    HashMap<Character, Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 100);
       
String s= "MMMMMDD";
    int total=0;
    for(int i=0;i<s.length();i++){
        int cur=map.get(s.charAt(i));
        if(i<s.length()-1){
            int next=map.get(s.charAt(i+1));
            if(cur<next){
                total-=cur;
            }
            else{
                total+=cur;
            }
        }
        else{
            total+=cur;
        }
    }


System.err.println(total);

 }   
}
