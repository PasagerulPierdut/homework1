package week1.basics;

import java.util.Arrays;

public class ExtraMile5 {

    public static void main(String[] args) {

        System.out.println(countChar("Dezoxiribonucleic", 'i'));

        System.out.println(redact("Anamaria"));

        System.out.println(isInsideArray(new String[]{"Ana", "are", "mere"}, "are"));

        System.out.println(Arrays.toString(words("Si vis pacem para bellum")));

        confidential("Ana are mere multe mere bune", new String[]{"mere", "Ana"});
    }

    public static int countChar(String s, char c) {

        char[] characters = s.toCharArray();
        int count = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == c) {
                count++;
            }
        }
        return count;
    }

    public static String redact(String s) {

        char[] characters = s.toCharArray();
        Arrays.fill(characters, '*');
        return String.valueOf(characters);
    }

    public static boolean isInsideArray(String[] arr, String s) {
        return Arrays.asList(arr).contains(s);
    }

    public static String[] words(String s) {

        String[] arr = s.split(" ");
        return arr;
    }

    public static void confidential(String s, String[] arr) {

        String[] phrase = words(s);

        for (int i = 0; i < arr.length; i++) {
            if (isInsideArray(phrase, arr[i])) {
                String regex = arr[i];
                String replacement = redact(regex);
                s = s.replaceAll(regex, replacement);
            }
            System.out.println(s);
        }
    }
}

