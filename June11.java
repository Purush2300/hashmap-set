public class June11 {
    public static void main(String[]args){
        int[]arr={2,3,1,6,5,4};
        int i=arr.length-2;
        
        while(i>=0 && arr[i]>arr[i+1]){
            i--;
        }
           if(i>=0){
             int j=arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }   
           
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
        reverse(arr,i+1,arr.length-1);
        
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
