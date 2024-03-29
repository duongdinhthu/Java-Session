package demo;

public class Cat extends Animal{
    private String color;
    private int age;
    private int height;

    public Cat(String name,String color, int age, int height) {
        // supper gọi tới constructor của lớp cha để gán giá trị cho casc field lớp cha
        super(name);
        this.color = color;
        this.age = age;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
// tính chất đa hình trong OOP
    @Override
    public void talk() {
        System.out.println("Miao Miao");
    }
}
