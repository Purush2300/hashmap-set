public class July6 {
    public static void main(String[] args) {
        int[]arr={3,1,3,-2,2,2,1,1,2,1,1,1,1};
        int k=4;
        int len=0;
        
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k && j-i+1>len){
                   
                        len=j-i+1;
                    
                }
            }
        }
        System.out.println(len);
    }
}
