package demo;

public class Person extends Animal{
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        super(name);
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void talk() {

    }
}
