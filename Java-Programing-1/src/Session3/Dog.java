package Session3;

public class Dog extends Animal {
private int height;
private int age;

    public Dog(String name,int height, int age) {
        // gọi tới constructor của lớp animal
        //giá trị field trong lớp cha sẽ được gán
        // constructor public Animal(String name) sẽ đợc gọi và gán giá tri
        super(name);
        // sau đó giá trị field trong lớp con mới ưc gán
        this.height = height;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override// thực hiện triển khai phương thức abstract
    public String getAnimalName() {
        return "Dog";
    }


}
