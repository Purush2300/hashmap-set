

public class July3{
public static void main(String[] args) {
    int[]arr={1,2,4,3,2,1};
    int k=3;
    int prefix=0;
    int cnt=0;
    for(int i=0;i<arr.length;i++){
        prefix+=arr[i];
        for(int j=i+1;j<arr.length;j++){
            if(prefix+arr[j]==k){
                cnt++;
            }
        }
        if(arr[i]==k){
            cnt++;
        }
    }
   System.out.println(cnt);
  

}
}