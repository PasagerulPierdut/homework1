package week1.basics;

public class ExtraMile11 {

    public static void main(String[] args) {

        System.out.println(returnSumOfEvenDigits(2194578));
    }

    public static int returnSumOfEvenDigits(int number) {

        int result = 0;
        String s = Integer.toString(number);
        int[] digitsArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digitsArray[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        for (int j = 0; j < digitsArray.length; j++) {
            if (digitsArray[j] % 2 == 0) {
                result += digitsArray[j];
            }
        }
        return result;
    }
}
