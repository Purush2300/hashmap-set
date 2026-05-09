import java.util.*;
import java.util.Arrays;
public class New {
    public static void main(String[] args) {
    int []a={1,2,3,4,5};
  int k=2;
int n=a.length;
k=k%n;
int[]temp=new int[k];

for (int i = 0; i < k; i++) {
    temp[i]=a[i];
}
for (int i = k; i < n; i++) {
    a[i-k]=a[i];
}


    for (int i = 0; i < k; i++) {
       
           a[n-k+1] =temp[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        

    }
   
   
    }

