package cafeteria;

import java.util.Scanner;

public class Main {
    static Student student = new Student();
    static Scanner input = new Scanner(System.in);
    static double sum = 0.00;
    private static double balance = 1000.00;


    public static void main(String[] args) {
        boolean ordering = true;
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        student.setFirstName(firstName);

        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        student.setLastName(lastName);

        System.out.println("Enter your gender");
        String gender = input.nextLine();
        student.setGender(gender);

        Student student = new Student(firstName, lastName, gender);
        //enrolls a student
        Student.enrollStudent(student);
        welcome();
        logic();

    }


        public static void welcome () {
            System.out.println("Enrollment successful\n" +
                    "Welcome " + student.getFirstName() + " " + student.getLastName() + " to school cafeteria.");
        }
        public static void logic(){
        System.out.println("Select one of the options below\n" +
                "1. Buy items\n" +
                "2. Print your meal card\n" +
                "3. Top up the card\n" +
                "4. Check your card balance\n" +
                "5. Quit"
        );
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                String[] items = new String[]{"Tea            ", "coffee         ", "Indian Pancakes ", "Omelette      ",
                        "Fried eggs    ", "Biscuits       ", "Quit          "};
                double[] rates = new double[]{40.00, 50.00, 70.00, 150.00, 100.00, 20.00, 0};
                int[] quantity = new int[7];
                boolean quit = true;

                do {
                    System.out.println("Item" + "\t\t\t\t\tCosts in KSH");
                    for (int i = 0; i < 7; i++)
                        System.out.println((i + 1) + "." + items[i] + "\t\t" + rates[i]);

                    int option = input.nextInt();
                    if (option > 0 && option < 7) {
                        System.out.println("Enter the quantities of " + items[option - 1]);
                        int q = input.nextInt();
                        quantity[option - 1] += q;
                    } else {
                        quit = false;
                    }
                } while (quit);

                System.out.println("Your Orders are:\n");
                for (int i = 0; i < 7; i++) {
                    if (quantity[i] != 0) {
                        sum += quantity[i] * rates[i];
                        System.out.println(items[i] + "*  " + quantity[i] + " == " + quantity[i] * rates[i] + "ksh");
                    }
                }
                System.out.println("Your total bill =  ksh" + sum);
                System.out.println("Thank you  " + student.getFirstName() + " " + student.getLastName());
                break;
            case 2:
                System.out.println("Here is your meal card");
                Student.mealCard(student);
                logic();
            case 3:
                System.out.println("Enter the amount to deposit");
                double amount = input.nextDouble();
                double currentBal = amount + balance;
                System.out.println("Your cards balance :" + currentBal + "ksh");
                logic();
            case 4:
                System.out.println("Your card balance is :");
                double balance1 = balance - sum;
                System.out.println("balance " + "ksh" + balance1);
                logic();
            case 5:
                break;
            default:
                System.out.println("invalid option");
        }
    }

}
