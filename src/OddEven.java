import java.util.Scanner;

public class OddEven {
    public static void main (String args[]){
        int even=0,odd=0;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("enter the number");
            int x = scanner.nextInt();
            if(x%2==0){
               // sum+=x;
                //System.out.println("the number is even");
            even=even+x;}
               // System.out.println("the sum is"+sum);}
                else if(x%2!=0){
                    odd=odd+x;
               // System.out.println("the number is odd");
                }}System.out.println("the sum of even no"+even);
            System.out.println("the sum of odd no"+odd);

            }

        }




