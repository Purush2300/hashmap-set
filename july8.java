

public class july8 {
    public static void main(String[] args) {
       int[]num= {0,6,5,2,2,50,11,9,4};
       int firstLen = 1;
       int secondLen = 2;
       
      int []nums=new int[num.length];
      nums[0]=num[0];
       for(int j=1;j<nums.length-1;j++){
            nums[j]=nums[j-1]+num[j];
       }
       int m=0;
       for(int i=1;i<nums.length;i++){
        int sum=nums[i]-nums[i-1];
        m=Math.max(sum, m);
       }
        System.out.println(m);
       int i=0;
       int j=1;
       int m1=0;
       while(j<num.length){
    
             
             if(num[i]!=m &&num[j]!=m){
                int sum=num[i]+num[j];
                System.out.println("sum of"+" "+num[i]+" "+num[j]+"--> "+sum);
                    m1=Math.max(sum, m1);
                System.out.println("Maxsum-->"+m1);
             }
             
          
        i++;
        j++;
       }
    System.out.println(m1+m);
    
      
    }
}
