public class Minimum {
    public static void main(String[] args) {
        int[]a={5,6,7,1,2,3,4};
        int min=Integer.MAX_VALUE;
        int i=0;int j=a.length-1;
        while (i<j) { 
            int mid=(i+j)/2;
            if(a[i]<a[mid]){
                min=Math.min(min, a[i]);
                i=mid+1;
            }
            else{
                min=Math.min(min, a[mid]);
                j=mid-1;
            }
        }
        System.err.println(min);
    }
}
