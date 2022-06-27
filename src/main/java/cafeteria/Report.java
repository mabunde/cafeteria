package cafeteria;

public class Report {
    private String meal;
    private double amount;
    private Student student;

    public Report(String meal, double amount, Student student) {
        this.meal = meal;
        this.amount = amount;
        this.student = student;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
