public class june7 {
    public static void main(String[] args) {
        int largest =Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int[]arr={12,35,1,10,34,1};
        for(int i=0;i<arr.length;i++){
                if(arr[i]>largest){
                    secondLargest=largest;
                    largest=arr[i];
                }
                else if(arr[i]>secondLargest &&arr[i]!=largest){
                    secondLargest=arr[i];
                }
        }
        System.out.println(secondLargest);
    }
}
