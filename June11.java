public class June11 {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        if(arr[0]>arr[1]){
             System.out.println(0);
                
            }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                System.out.println(i);
                return;
            }
            
             if(arr[arr.length-1]>arr[arr.length-2]){
               
                    System.out.println(arr[arr.length-1]);
                    return;
                   
                
            }
        }
    }
}
