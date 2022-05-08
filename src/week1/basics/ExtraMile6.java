package week1.basics;

public class ExtraMile6 {

    public static void main(String[] args) {

        countTo100UsingWhile();

        countTo100UsingDoWhile();

        countTo100UsingFor();
    }

    public static void countTo100UsingWhile() {

        int i = 1;
        while (i < 101) {
            System.out.println(i);
            i++;
        }
    }

    public static void countTo100UsingDoWhile() {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 101);
    }

    public static void countTo100UsingFor() {

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }
}
