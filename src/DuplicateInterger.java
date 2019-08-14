public class DuplicateInterger {

    public static void main(String[] args) {
        int[] value = {10, 34, 50, 34, 9, 20, 10};

        for (int i = 0; i < value.length; i++)
        { for (int j = i + 1 ; j < value.length; j++) {
            if (value[j]==(value[i]))
                System.out.println("The duplicate   number is "+value[j]);

                }
            }}}
