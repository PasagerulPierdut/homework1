package week1.basics;

import java.util.Arrays;

public class ExtraMile9 {

    public static void main(String[] args) {

        printTwoElementsPerLine(new String[]{"Ana", "are", "mere", "verzi", "si", "galbene"});
    }

    public static void printTwoElementsPerLine(String[] param) {

        if (param.length % 2 == 0) {
            String[][] newStringArray = new String[param.length / 2][];
            int j = 0;
            for (int i = 0; i < param.length; i += 2) {
                String[] pairOfStrings = new String[2];
                pairOfStrings[0] = param[i];
                pairOfStrings[1] = param[i + 1];
                newStringArray[j] = pairOfStrings;
                j++;
            }
            for (String[] strings : newStringArray) {
                System.out.println(Arrays.toString(strings));
            }
        } else {
            System.out.println("Only divisible by 2");
        }
    }
}
