



public class July3{
public static void main(String[] args) {
    int[]arr={1,4,2,3,1};
    int k=5;
    int maxlen=0;
    int minlength=Integer.MAX_VALUE;
    int cntmin=0;
    for(int i=0;i<arr.length;i++){
       int prefix=0;
        for(int j=i;j<arr.length;j++){
            prefix+=arr[j];
            if(prefix==k && j-i+1 >maxlen){
                maxlen=j-i+1;
            }
             if(prefix==k && j-i+1 <minlength){
                cntmin++;
                minlength=j-i+1;
                
            }
        }
    }
System.out.println(maxlen);
System.out.println(minlength+" mininumlength");
System.out.println(cntmin);
}
}