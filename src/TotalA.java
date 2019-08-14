import java.util.Scanner;

public class TotalA {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len = scanner.nextInt();
         String arr[] = new String[len];
     int count=0;//bdchyfvivdubbu
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Enter the name" );
            String name = scanner.next();
           // char a=scanner.next().charAt(65);
        for(int j=0;j<arr.length;j++)
            if(name.charAt(j)=='a'){
                System.out.print("Total a ");
                count++;
        }
            System.out.println("Letters: "+count);}
    }
}