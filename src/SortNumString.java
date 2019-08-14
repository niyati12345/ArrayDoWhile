import java.util.Arrays;

public class SortNumString {
    public static void main(String args[]){
        String[] city={"London","Amedabad","Kerela","Delhi","Agra"};

        System.out.println("original city "+Arrays.toString(city));
        Arrays.sort(city);
        System.out.println("sorting is"+ Arrays.toString(city) );
//sorting integer
        int[]number={5,6,8,3,5};
        System.out.println("original city "+Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("sorting is"+ Arrays.toString(number) );

    }
}
