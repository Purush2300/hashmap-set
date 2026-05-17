
import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        
        char[]arr=s.toCharArray();
        char[]arr1=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.equals(arr, arr1));
           
        
    }
}
