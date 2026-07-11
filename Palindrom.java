public class Palindrom {
    public static void main(String[] args) {
        String s=" Changed ";
       s= s.trim();
        String[]arr=s.split("\\s+");
        String ans="";
       for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i];
            if(i!=0){
                ans+=" ";
            }
       }
       System.err.println(ans);
    }
}
