package Session3;

public class Cat extends Animal {
    private double height;
    private int age;
    private boolean sleepDay;
    public Cat(String name,double height, int age,boolean sleepDay) {
        super(name);
        this.height = height;
        this.age = age;
        this.sleepDay = true;
    }

    public boolean isSleepDay() {
        return sleepDay;
    }

    public void setSleepDay(boolean sleepDay) {
        this.sleepDay = sleepDay;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAnimalName() {
        return "Cat";
    }
}
