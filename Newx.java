import java.util.*;

public class Newx {

    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int maxele = -1;
        int minele = -1;

        int[] a = {1,1,2,2,2,2,3,4};

        for(int i = 0; i < a.length; i++) {

            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> itr : map.entrySet()) {

            int n = itr.getKey();

            int count = itr.getValue();

            if(count > maximum) {

                maximum = count;

                maxele = n;
            }

            if(count < minimum) {

                minimum = count;

                minele = n;
            }
        }

        System.out.println(maximum + " - " + maxele);

        System.out.println(minimum + " - " + minele);
    }
}