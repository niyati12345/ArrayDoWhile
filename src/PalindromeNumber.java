import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]) {
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        temp = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;//getting length of number
            reverse = reverse * 10 + digit;//
            number = number / 10;
        }
        if (temp == reverse) {
            System.out.println("palindrome number ");
        }
        else{System.out.println("palindrome not number ");

}}}