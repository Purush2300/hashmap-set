public class Peak {
    public static void main(String[] args) {
        int []a={1, 2, 4, 5, 7, 8, 3};
        System.err.println(find(a));
    }

    private static boolean  find(int[] a) {
        int n=a.length;
        if(n==1) return 0;
        if(a[0]>a[1]) return 1;
        if(a[n-1]>a[n-2]) return n-1;;
        int i=1;int j=n-2;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]>a[mid+1] && a[mid]>a[mid-1]){
                return 1;
            }
            if(a[mid]>a[mid-1]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return 0;
    }
}
