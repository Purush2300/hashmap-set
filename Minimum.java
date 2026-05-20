public class Minimum {
    public static void main(String[] args) {
        int[]a={5,6,7,1,2,3,4};
        int dex=0;
        int min=Integer.MAX_VALUE;
        int i=0;int j=a.length-1;
        while(i < j) {

            int mid = (i + j) / 2;

            if(a[mid] > a[j]) {
                i = mid + 1;
            }
            else {
                j = mid;
            }
        }

        dex = i;
        System.err.println(a[dex]);
        System.err.println(dex);
    }
}
