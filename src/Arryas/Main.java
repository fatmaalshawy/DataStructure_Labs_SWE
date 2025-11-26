package Arrays;

import Arryas.Array;

public class Main {
    public static void main(String[] args) {
        Array arr= new Array();
        int []numbers={1,2,3,4,5};

        numbers[3]=8;
        //arr.update(numbers,3,8);
        arr.delete(numbers,3);

        //int []numbers2=new int[5];
        //arr.input(numbers2);
        // arr.R_Traversal(numbers);
        arr.Traversal(numbers);





        //System.out.println(Arrays.toString(numbers));



    }
}