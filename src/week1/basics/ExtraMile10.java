package week1.basics;

import java.util.Arrays;

public class ExtraMile10 {

    public static void main(String[] args) {

        System.out.println(formatString("abc", 10));
    }

    public static String formatString(String s, int size) {

        if (s.length() < size) {
            char[] complementarySize = new char[size - s.length()];
            Arrays.fill(complementarySize, ' ');
            return String.valueOf(complementarySize).concat(s);
        } else {
            return "The fixed size is smaller than the given string' size";
        }
    }
}

