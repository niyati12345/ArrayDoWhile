import java.util.Scanner;

public class ScannerReverseFivedigit {

    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int reverse=0;
        while(number!=0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number/=10;
        }
        System.out.println("thw reverse number is"+reverse);




    }
}
