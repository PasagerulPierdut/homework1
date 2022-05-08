package week1.basics;

public class ExtraMile3 {

    public static void main(String[] args) {

        String[] names = new String[3];
        int[] age = new int[3];

        names[0] = "John";
        names[1] = "Mary";
        names[2] = "Anna";

        age[0] = 3;
        age[1] = 5;
        age[2] = 7;

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " has " + age[i] + " years.");
        }
    }
}
