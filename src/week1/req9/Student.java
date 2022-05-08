package week1.req9;

public class Student {

    private static double sumOfGrades = 0;

    private static double numberOfStudents = 0;

    private final String name;

    private final int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        count(grade);
    }

    private static void count(int grade) {

        sumOfGrades += grade;
        numberOfStudents += 1;
    }

    public static void calculateAverage() {
        System.out.println(sumOfGrades / numberOfStudents);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
