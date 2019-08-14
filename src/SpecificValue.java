import java.util.Scanner;

public class SpecificValue {
    public static void main(String[]args){

        System.out.println("Enter the number");
        Scanner entnum=new Scanner(System.in);

        int arr[]={1,2,4,5,6,7};
        int b=entnum.nextInt();


        for(int i=0;i< arr.length;i++) {
            if (arr[i]==b) {
                System.out.println("array value is " + b + " thE postion is" + i);
            }
           // else {
                 //   System.out.println("ARRAY DOESNOT CONTAIN THIS VALUE");;
        //}
            }}}

       // int a[]={1234,654,7890,54367};
        //int c=a[3];
        //for (int i=0;i<4;i++){
       //if(c==a[i]){
         //  System.out.println("the value is "+a[i]);
        //}
        //System.out.println(a[i]);
    //}
