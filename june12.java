public class june12 {
    public static void main(String[] args) {
        int[]arr={6,7,8,1,2,3,4,5};
        int target=7;
       
int i=0;
int j=arr.length-1;
while(i<=j){
    int mid=(i+j)/2;
    if(arr[mid]==target){
        System.out.println(mid);
    }

if(arr[i]<arr[mid]){
    if(arr[i]<=target && target<arr[mid]){
        j=mid-1;
    }
    else{
        i=mid+1;
    }
}
else{
    if(target>arr[mid]&& target<arr[j]){
        i=mid+1;
    }
    else{
        j=mid-1;
    }
}
















}

    }
   
}
