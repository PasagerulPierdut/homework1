package week1.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraMile12 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(calculate(171, 3)));
    }

    public static int[] calculate(int n, int k) {

        List<Integer> divisibleEvenlyWIthK = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (i % k == 0) {
                divisibleEvenlyWIthK.add(i);
            }
        }
        int[] numArray = divisibleEvenlyWIthK.stream()
                .mapToInt(i -> i)
                .toArray();
        return numArray;
    }
}
