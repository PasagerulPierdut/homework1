package week1.recursion;

public class Main {

    static int sum = 0;

    public static void main(String[] args) {

        System.out.println(calculateSumOfDigits(495));

        int result = sumFirstIntegerNumbers(22);
        System.out.println(result);

        int resultEven = sumFirstEvenIntegers(5);
        System.out.println(resultEven);


        String stringTest = new String("anina");
        System.out.println(checkPalindrome(stringTest));

        System.out.println(valueForIntElementOfFibonacci(14));
    }

    public static int calculateSumOfDigits(int number) {
        sum = number % 10;
        if (number == 0) {
            return 0;
        } else {
            return sum + calculateSumOfDigits(number / 10);
        }
    }

    public static int sumFirstIntegerNumbers(int number) {
        if (number > 0) {
            return number + sumFirstIntegerNumbers(number - 1);
        } else {
            return 0;
        }
    }

    public static int sumFirstEvenIntegers(int number) {
        if ((number % 2) != 0) {
            number = number - 1;
        }
        if (number > 1) {
            return number + sumFirstEvenIntegers(number - 2);
        } else {
            return 0;
        }
    }

    public static boolean checkPalindrome(String palindrome) {
        if (palindrome.length() == 1) {
            return true;
        }
        if (palindrome.charAt(0) == (palindrome.charAt(palindrome.length() - 1))) {
            return checkPalindrome(palindrome.substring(1, palindrome.length() - 1));
        }
        return false;
    }

    public static int valueForIntElementOfFibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return valueForIntElementOfFibonacci(number - 1) + valueForIntElementOfFibonacci(number - 2);
        }
    }
}
