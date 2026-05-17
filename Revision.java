
public class Revision {
    public static void main(String[] args) {
        String []s={"flower","flow","flight"};
        String p=s[0];
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            for(int j=1;j<s.length;j++){
                if(i>s[j].length()||s[j].charAt(i)!=ch){
                    System.err.println(p.substring(0,i));
                }
            }
        }
      
    }
}
