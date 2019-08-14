import java.util.Scanner;

public class IndexOfArray {

    public static void main(String[]args){


        Scanner scanner=new Scanner(System.in);
       // System.out.println("Enter the array element from the array list");
        int[] arr={10,20,40,76,45};
        System.out.println("Enter the array element from the array list");
        int userinput = scanner.nextInt();
        for(int i=0;i<=4;i++) {

            if (userinput == arr[i]) {
                System.out.println("the postion of element  " + userinput + "is at " + i + " index");
            }}}}



