public class Captial {
    public static void main(String[] args) {
        String s="cbbd";
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(palindrom(sub)&& sub.length()>ans.length()){
                    ans=sub;
                }
            }
        }
        System.out.println(ans);
        
    }
    public static boolean  palindrom(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
