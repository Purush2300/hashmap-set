public class June11 {
    public static void main(String[]args){
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
       int top=0;
       int bottom=arr.length-1;
       int left=0;
       int right=arr[0].length-1;
       int[]res=new int[arr.length*arr[0].length];
       int k=0;
        while(left<=right && top<=bottom){
             for(int i=left;i<=right;i++){
            res[k++]=arr[top][i];
        }
        top++;
        
        for(int i=top;i<=bottom;i++){
        res[k++]=arr[i][right];
           
        }
        right--;
       if(top<=bottom){
         for(int j=right;j>=left;j--){
              res[k++]=arr[bottom][j];
        }
       }
       bottom--;

         if(left<=bottom){
         for(int j=bottom;j>=top;j--){
              res[k++]=arr[j][left];
        }
       }
       left++;
        }


       
            for(int j=0;j<res.length;j++){
             System.err.print(res[j]+" ");
            }
            
      
    }

  
}
