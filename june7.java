public class june7 {
    public static void main(String[] args) {
        
        int[]arr={1,1,0,1,1,1,0,0,1,1,1,1,1};
       
    
        
       
        int max=0;
        int curr=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            curr++;
            max=Math.max(curr, max);

        }
        else{
            curr=0;
        }
    }
       System.out.println(max);
    }

}
