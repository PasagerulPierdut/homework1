package week1.basics;

public class ExtraMile8 {

    public static void main(String[] args) {

        printEvery2ndElement(new Integer[]{1, 2, 3, 4, 5, 6, 7});
    }

    public static void printEvery2ndElement(Object[] param) {

        for (int i = 2; i < param.length + 1; i += 2) {
            System.out.println(i);
        }
    }
}
