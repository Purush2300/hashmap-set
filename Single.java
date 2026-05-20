public class Single {
    public static void main(String[] args) {
        int[]a={1,1,2,2,3,3,4,5,5,6,6};
        System.err.println(singleelement(a));
    }

    private static int singleelement(int[] a) {
        int i=1;
        int j=a.length-2;
       int n=a.length;
       if(n==1) return a[0];
       if(a[0]!=a[1]) return a[0];
       if(a[n-1]!=a[n-2]) return a[n-1];

        while(i<=j){
            int mid=(i+j)/2;
        if(a[mid]!=a[mid-1]&&a[mid]!=a[mid+1]){
           return a[mid];
        }
        if((mid%2==1)&& a[mid-1]==a[mid] || (mid%2==0)&&a[mid]==a[mid+1]){
            i=mid+1;
        }
        else{
            j=mid-1;
        }

    }
    return 1;
}
}
