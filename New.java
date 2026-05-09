import java.util.*;
import java.util.Arrays;
public class New {
    public static void main(String[] args) {
    int []a={0,0,3,3,5,6};
    int j=0;
    for (int i = 0; i < a.length; i++) {
        if(a[i]!=a[j]){
            j++;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

    }
    System.out.println(j+1);
   
    }
}
