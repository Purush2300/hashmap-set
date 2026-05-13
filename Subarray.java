public class Subarray {
 public static void main(String[] args) {
     String []s={"flower","flow","flight"};
     String prif=s[0];
    for(int i=0;i<prif.length();i++){
        char ch=prif.charAt(i);
        for(int j=0;j<s.length;j++){
            if(i>=s[j].length()||s[j].charAt(i)!=ch){
                System.err.println(prif.substring(0,i));
                return ;
            }
        }
    }
     System.err.println(prif);
 }   
}
