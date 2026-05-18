public class Sub {
    public static void main(String[] args) {
       String ma="";
        String s="ababa";
            for(int i=0;i<s.length();i++){
                for(int j=i+1;j<=s.length();j++){
                    if(palindrome(s,i,j)){
                        String sub=s.substring(i,j);
                        if(sub.length()>ma.length()){
                            ma=sub;
                        }
                    }
                }
            }
System.err.println(ma);
        
        
    }

    private static boolean  palindrome(String s,int i,int j) {
      
       while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            
            return false;
        }
        i++;
        j--;
       }
     return true;
    }
}
