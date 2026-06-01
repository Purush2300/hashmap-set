public class Captial {
    public static void main(String[] args) {
        String s="how         are you purush";
        char[]c=s.toCharArray();
        if(c[0]>='a'&&c[0]<='z'){
            c[0]=(char)(c[0]-32);
        }
        for(int  i=1;i<c.length;i++){
            if(c[i-1]==' '&&c[i]>='a'&&c[i]<='z'){
                c[i]=(char)(c[i]-32);
            }
        }
        System.err.println(c);
    }
}
