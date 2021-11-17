import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        while (ok) {
            System.out.println("Enter a number below 101: ");
            int n = sc.nextInt();
            if (n>100){
                System.out.println("Number is over 100, please try again. ");
            }
            else {
                ok = false;
                if (n%3==0 && n%5==0){
                    System.out.println("FizzBuzz");
                }
                else if (n%3==0){
                    System.out.println("Buzz");
                }
                else if (n%5==0){
                    System.out.println("Fizz");
                }
                else System.out.println("The number isn't divisible with 3 or 5. ");
            }
        }
    }
}
