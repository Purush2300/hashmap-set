public class May21 {
    public static void main(String[] args) {
        int n=66;
        int i=1;
        int j=n;
        while(i<=j){
            int mid=(i+j)/2;
            if(mid*mid==n){
                System.out.println(mid);
                return;
            }
            else if(mid*mid<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
       
         System.err.println(j);
         
    }
}
