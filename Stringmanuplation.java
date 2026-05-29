public class Stringmanuplation {
    public static void main(String[] args) {
        String s="java";
        int i=3;
        // leftrotate(s,i);
        rightrotate(s,i);
    }

    private static void leftrotate(String s, int i) {
       char[]c=s.toCharArray();
       char[]temp=new char[i];
       i=i%s.length();
       for(int j=0;j<i;j++){
        temp[j]=c[j];
       }
       for(int k=i;k<s.length();k++){
        c[k-i]=c[k];
       }
       for(int x=0;x<temp.length;x++){
        c[s.length()-i+x]=temp[x];
       }
       for(int d=0;d<c.length;d++){
        System.err.print(c[d]+" ");
       }
    }

    private static void rightrotate(String s, int i) {
       int n=s.length();
       i=i%n;
        char[]c=s.toCharArray();
        char[]temp=new char[i];
        for(int j=0;j<i;j++){
            temp[j]=c[n-i+j];
        }
        for (int idx = n-i-1; idx >=0; idx--) {
            
            c[idx+i]=c[idx];
        }
        for(int k=0;k<temp.length;k++){
            c[k]=temp[k];
        }
        for(int d=0;d<c.length;d++){
        System.err.print(c[d]+" ");
       }
    }
}
