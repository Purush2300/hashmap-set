
import java.util.HashMap;
import java.util.Map;

public class Freqency {
    public static void main(String[] args) {
        int maxfeq=Integer.MIN_VALUE ,maxele=0;
        int minfreq=Integer.MAX_VALUE,minele=0;
        HashMap<Integer,Integer> map=new HashMap<>();
            int[]a={1,1,1,1,5,3,7,2,};
            for(int i=0;i<a.length;i++){
                map.put(a[i], map.getOrDefault(a[i],0)+1);
            }
            for(Map.Entry<Integer,Integer> map1:map.entrySet()){
               int number=map1.getKey();
               int count=map1.getValue();
               if(count>maxfeq){
                    maxfeq=count;
                    maxele=number;
               }

                if(count<minfreq){
                    minfreq=count;
                    minele=number;
                }

            }



            System.out.println(maxele+"->"+maxfeq);
            System.err.println(minele+"->"+minfreq);
    }
}
