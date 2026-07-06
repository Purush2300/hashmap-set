public class July6 {
    public static void main(String[] args) {
       String s="a";
       String a="";
       int i=0;
       int j=i+1;
       int len=0;
       while(i<s.length() && j<s.length()){
        char c1=s.charAt(i);
        char c2=s.charAt(j);
        if(c1==c2){
            i++;
        }
        len=Math.max(len, j-i+1);
        j++;
       }
       System.out.println(len);
    }
}
