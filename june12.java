public class june12 {
    public static void main(String[] args) {
        int[]arr={-1,0,3,5,9,12};
        int target=9;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }
            if(arr[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
    }
}
