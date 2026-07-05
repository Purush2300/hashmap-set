public class June10 {
    public static void main(String[] args) {
        int[]arr={8,7,6,4,11,11};
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]*arr[j]==36){
                System.out.println(arr[i]+" "+arr[j]);
                return;
            }
            else if(arr[i]*arr[j]>36){
                i++;
            }
            else{
                j--;
            }
        }
    }
}
