package edunextS9;

public class  PlayerIncome extends Player implements Tax {
    private double salary;
    public PlayerIncome(String name, double salary){
        super(name);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String displayDetails() {
        return null;
    }

    @Override
    public double calculateTax() {
        double income = salary * 0.1;
        return income; // Ví dụ: tính thuế 10% thu nhập
    }


}
