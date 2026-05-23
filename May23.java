public class May23 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int n=a.length;
        int k=2;
      
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

    private static void reverse(int[] a, int i, int j) {
        
       while(i<j){
        int y=a[i];
        a[i]=a[j];
        a[j]=y;
        i++;
        j--;
       }
       
    }
}
