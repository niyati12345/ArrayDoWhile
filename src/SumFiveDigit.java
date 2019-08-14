import java.util.Scanner;

public class SumFiveDigit {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter the number");
            int x=scanner.nextInt();
            sum=sum+x;

        }
        System.out.println("Total sum is:"+sum);
    }
}
