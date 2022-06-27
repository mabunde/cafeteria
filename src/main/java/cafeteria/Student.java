package cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private double balance;

    private static List<Student> studentsEnrolled = new ArrayList<>();
    public static List<Report> cafeReports = new ArrayList<>();

    public Student() {
    }

    public Student(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void enrollStudent(Student student) {

        studentsEnrolled.add(student);
    }
    public static void mealCard(Student student){
        System.out.println("Name: " + student.firstName + " " + student.lastName);
        System.out.println("Gender: " + student.gender);
        System.out.println("Enrolled: Yes");

        System.out.println("\n");
    }
}
