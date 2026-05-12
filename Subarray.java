public class Subarray {
 public static void main(String[] args) {
     String s="35427";
     
     for(int i=s.length()-1;i>=0;i--) {
            char ch=s.charAt(i);
            if((ch-'0')%2!=0){
                    System.err.println(s.substring(0, i+1));
                    return;
            }
            
        }
        System.err.println(" ");
 }   
}
