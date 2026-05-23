
import java.util.HashMap;



public class May23 {
    public static void main(String[] args) {
       HashMap<Integer,Integer> map=new HashMap<>();
               int[]a={2,7,11,15};
               int k=18;




             for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]+a[j]==k){
                        System.out.println(i+" "+j);
                        return;
                    }
                }
             }
               }
       
        }
        

    

       
    

