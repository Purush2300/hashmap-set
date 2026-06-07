public class june7 {
    public static void main(String[] args) {
        
        int[]arr1={1,2,3,4,5};
        int[] arr2={1,2,3,6,7,8};
        int a=arr1.length;
        int b=arr2.length;
    
        int []temp=new int[a+b];
        int k=0;
        int i=0;
        int j=0;
        while(i<a && j<b){
            if(arr1[i]<arr2[j]){
                temp[k++]=arr1[i];
            }
            else{
                temp[k++]=arr2[j];
            }
            i++;
            j++;

        }
        while(i<a){
            temp[k++]=arr1[i++];
        }
        while(j<b){
            temp[k++]=arr2[j++];
        }
        for(int p=0;p<temp.length;p++){
            System.out.print(temp[p]+" ");
        }
    }

}
