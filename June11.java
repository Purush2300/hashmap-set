public class June11 {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        int n=arr.length-1;
      int i=0;
      int j=n;
        
      while(i<=j){
        int mid=(i+j)/2;

        if(i==0||arr[i-1]<arr[mid] && i==n||arr[mid]>arr[i+1]){
            System.out.println(mid);
            return;
        }
        else if(arr[i]>arr[i-1]){
            i=mid+1;
        }
        else{
            j=mid-1;
        }
      }
    }
}
