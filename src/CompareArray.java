import java.util.Arrays;

public class CompareArray {
    public static void main(String[]args){

        int arr[]={25,45,65,70,80,90};
        int brr[]={25,45,6,70,80,90};
         if(Arrays.equals(arr,brr)) {
             System.out.println("ARRAYS MATCH :" + Arrays.equals(arr, brr));
         }
       else{
             System.out.println("ARRAYS DOESN'T MATCH :"+ Arrays.equals(arr,brr));
         }
}}
