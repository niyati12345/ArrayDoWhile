import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[]args){
        int a,c=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        int number=n;

        while(n>0) {
             a=n%10;
             n=n/10;
            c=c+(a*a*a); }
          if(number==c){
              System.out.println("The number is armstrong number"); }
          else{
              System.out.println("The number is not armstrong number");
}}}
