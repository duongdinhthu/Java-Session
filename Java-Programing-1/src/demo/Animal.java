package demo;

public abstract class Animal {
    private String name;


    public Animal(String name) {
this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // phương tức abstrct thể hiện tính trừu tượng cho phép được định nghĩa lạiở lớp con
    public abstract void talk();
}
