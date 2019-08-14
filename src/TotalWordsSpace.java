import java.util.Scanner;

public class TotalWordsSpace {
    public static void main(String[]args){

// Didn't get proper logic.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
       int word=1;
        for(int i=0;i<name.length();i++) {
            if (name.charAt(i) == ' ')
                word++;
            //System.out.println("Total words"+word);
        }

        System.out.println("Total words"+word);
        System.out.println("Total space in words"+(word-1));

    }
}
