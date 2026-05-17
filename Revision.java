public class Revision {
    public static void main(String[] args) {
        String s="287912121212964444668";
        
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if((c-'0')%2!=0){
                System.out.println(s.substring(0,i+1));
                return;
            }
        }
        
    }
}
