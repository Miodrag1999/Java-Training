import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        int x,y=0,temp=0;
        while (ok) {
            System.out.println("Enter a number from 1 to 99999: ");
            int n = sc.nextInt();
            if (n<1 || n>99999){
                System.out.println("Number is out of range. ");
            }
            else {
                ok = false;
                y=n;
                while(n>0)
                {
                    x=n%10;
                    n=n/10;
                    temp=temp*10+x;
                }
                if(temp==y){
                    System.out.println("Palindrome");
                }
                else{
                    System.out.println("Not palindrome");
                }
            }
        }
    }
}