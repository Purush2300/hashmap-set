import java.util.HashMap;

public class New {
    public static void main(String[] args) {
    
int[]arr={12,4,3,4,3,4,6,6,4,3,45,2,2,5,6,66,777,44,33};
   HashMap<Integer, Integer> map = new HashMap<>();

      int k=7;
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];

            
            if(map.containsKey(sum - k)) {

                count += map.get(sum - k);
            }

            // store frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.err.println(count);
    }
    }
  




        

