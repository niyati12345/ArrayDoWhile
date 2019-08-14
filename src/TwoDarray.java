public class TwoDarray {


    public static void main(String args[]){
        int orignal [][]={{1,2,3},{4,5,6},{7,8,9}};

       // int tranpose[][]=new int[3][3];



        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(orignal[i][j]);
            }
            System.out.println( "");
        }
        System.out.println("*******");
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(orignal[j][i]);

        }System.out.println( "");
    }}}
