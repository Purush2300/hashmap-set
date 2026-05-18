public class Sub {
    public static void main(String[] args) {
        String max="";
        String s="abcabcewd";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
               String sub=s.substring(i,j);
               if(sub.length()>max.length()){
                max=sub;
               }
            }
        }
        System.err.println(max);
    }
}
