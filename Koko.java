public class Koko {
    public static void main(String[] args) {
        int[]a={13,16,17,11};
        int h=8;
        int i=1;int j=max(a);

        int ans=Integer.MAX_VALUE;
            while(i<j){
                int mid=(i+j)/2;
                int total=timetaken(a,mid);
                if(total<=h){
                    ans=mid;
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }


       System.err.println(ans);
    }

    private static int max(int[] a) {
        int max=0;
        for(int i=0;i<a.length;i++){
            max=Math.max(a[i],max);
        }
        return max;
    }

    private static int timetaken(int[] a, int mid) {
        int totalhrs=0;
        for(int pil:a){
            totalhrs+= (pil+mid-1)/mid ;
        }
        return totalhrs;
    }
}
