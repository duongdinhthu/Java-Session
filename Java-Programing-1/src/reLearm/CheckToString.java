package reLearm;

public class CheckToString {
    private String name = "Thu";
    private int age = 30;

    public CheckToString(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        CheckToString checkToString = new CheckToString("Bao",24);
        System.out.println(checkToString);
    }
}
