public class July9kodnest {
 public static void main(String[] args) {
     String s="welcome to my payroll     ";
     int i=s.length()-1;
     int len=0;
     while(i>=0 && s.charAt(i)==' '){
        i--;
     }
     while(i>=0 && s.charAt(i)!=' '){
        len++;
        i--;
     }
     System.out.println(len);
 }   
}
