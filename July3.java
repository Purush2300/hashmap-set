

public class July3{
public static void main(String[] args) {
    int[]arr={3, 2, 3, 2, 4, 3};
    int l=0;
    int r=4;
    int[]prefix=new int[arr.length];
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
    }
    int sum=0;
    if(l==0){
         sum=prefix[r];
         System.out.println(sum);
    }
    else{
           sum=prefix[r]-prefix[l-1];
           System.out.println(sum);
    }
  
for(int i=0;i<prefix.length;i++){
    System.out.println(prefix[i]);
}

}
}