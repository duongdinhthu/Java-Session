package demo;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("Chau A",3,"gender");
        Animal meo = new Cat("meo","vang",2,123);
        Animal person1 = new Person("qer",12,"ok");
        //instanceof là kiểm tra xem có thộc không? trả về giá trị true fale
        boolean animal = meo instanceof Animal;
        System.out.println(animal);
    }
}
