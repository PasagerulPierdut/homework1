package week1.basics;

import java.util.Arrays;

public class ExtraMile7 {

    public static void main(String[] args) {

        printArrayParam(new Integer[]{9, 12});
    }

    public static void printArrayParam(Object[] param) {
        System.out.println(Arrays.toString(param));
    }
}
