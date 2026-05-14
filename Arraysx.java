
public class Arraysx {
    public static void main(String[] args) {
        int []arr={2,2,2,3,1,1,2,4,4,4,3,3};

        int maxfreq=Integer.MIN_VALUE;
        int minfreq=Integer.MAX_VALUE;
        int maxele=0;
        int minele=0;
        for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>maxfreq){
                maxele=arr[i];
                maxfreq=cnt;
                }
                if(cnt<minfreq){  
                    minele=arr[i];
                    minfreq=cnt;
                }
        }
        System.err.println(maxele+" ->"+maxfreq);
        System.err.println(minele+"-> "+minfreq);
    }
}
