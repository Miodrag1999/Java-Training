import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give first string: ");
        String A = sc.next();
        System.out.println("Give second string: ");
        String B = sc.next();
        System.out.println(A.length()+B.length());
        int lex=A.compareTo(B);
        if (lex<0){
            System.out.println("Yes");
        }
        else if (lex==0){
            System.out.println("Equals");
        }
        else if (lex>0){
            System.out.println("No");
        }
        String A1=A.substring(0,1).toUpperCase() + A.substring(1);
        String B1=B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A1.concat(B1));
    }
}
