package edunextS12;

public class Employee {
    private String name;//khai bao bien kieu String co ten la name, chi su dung trong class
    private int age;//khai bao bien kieu int co ten la age , chi su dung trong class
    private int employee;
// khai bao constructor - ham khoi tao doi tuong co cac thuoc tinh ben tren
    public Employee(String name, int age, int employee) {
        super();
        this.name = name;
        this.age = age;
        this.employee = employee;
    }
    // khai bao cac ham get va set cho cac thuoc tinh ben tren

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }
    //khai bao phuong thuc toString de in ra cac thuoc tinh sau khi da duoc khoi tao

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", employee=" + employee +
                '}';
    }
}
