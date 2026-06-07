public class june7 {
    public static void main(String[] args) {
        
        int[]arr={1,2,3,4,5};
        int n=arr.length;
        int k=2;
        // Right rotate----}
        k=k%n;
        int []temp=new int[k];

        for(int i=0;i<k;i++){
               temp[i]=arr[n-k+i]; 
        }
   
        for(int i=n-k-1;i>=0;i--){
           arr[i+k] =arr[i];
        }
        for(int i=0;i<k;i++){
       arr[i]=temp[i];
        }
        for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" ");
       }
    }
}
