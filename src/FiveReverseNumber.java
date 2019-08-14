import java.util.Scanner;

public class FiveReverseNumber {
    public static void main(String args[]) {
        int sum,number;
        //user input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the five digit ");
         number = scanner.nextInt();
//sum formula
        for ( sum = 0; number != 0; number/=10) {
           // System.out.println("Enter the five digit ");
            sum+=number%10;
        }
        System.out.println("the sum is"+sum);
    }
}