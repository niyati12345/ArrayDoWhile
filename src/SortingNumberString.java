import java.util.Scanner;

public class SortingNumberString {

    public static void main(String[]args){{
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the length of array");
        int x=scanner.nextInt();
        int a[]= new int[x];
        for(int c=0;c<=a.length;c++){
            System.out.println("enter the number");
            int b=scanner.nextInt();
            a[c]=b;
            System.out.println(b +"is in the postion" +c);

        }
    }






    }
}
