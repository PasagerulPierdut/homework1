package week1.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ExtraMile4 {

    public static void main(String[] args) {

        String[] names = new String[]{"Adriana", "Andrei", "Ion", "Mioara", "Vasile", "Viorica"};

        printAllWithA(names);

        printGivenString(names, "iO");

        printFirstThreeCharacters(names);

        printRandomLetter(names);

        anonymizeR(names);

        abbreviateMiddleName("Mateiu Ioan Caragiale");
    }


    public static void printAllWithA(String[] arr) {

        List<String> aNames = Arrays.stream(arr)
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(aNames);
    }

    public static void printGivenString(String[] arr, String s) {
        String searchString = s.toLowerCase();
        List<String> workList = transformAllToLowerCase(arr);
        System.out.println(workList.stream().
                filter(s1 -> s1.contains(searchString)).
                collect(Collectors.toList()));
    }

    public static void anonymizeR(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace('r', '*');
            System.out.println(Arrays.stream(arr).toList());

        }
    }

    private static void printFirstThreeCharacters(String[] arr) {

        List<String> firstThreeLetters = new ArrayList<>();
        for (String s : arr) {
            String trimmed = s.substring(0, 3);
            firstThreeLetters.add(trimmed);
        }
        System.out.println(firstThreeLetters);
    }

    public static void printRandomLetter(String[] arr) {

        List<String> aList = Arrays.stream(arr).toList();
        Random r = new Random();
        String randomString = aList.get(r.nextInt(aList.size()));
        System.out.println(randomString.charAt(r.nextInt(randomString.length())));
    }

    public static void abbreviateMiddleName(String s) {

        String[] allNames = s.split(" ");
        if (allNames.length == 3) {
            System.out.println(allNames[0].toString() + " " + allNames[1].substring(0, 1) + ". " + allNames[2]);
        } else {
            System.out.println("It works only on 3 names.");
        }
    }

    private static List<String> transformAllToLowerCase(String[] arr) {

        return Arrays.stream(arr)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }
}

