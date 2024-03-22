import Session2.Person;
//import Session3.SportCar;

import java.sql.PreparedStatement;// kế thuwfa hoàn toàn khi đã import

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] agrs) {
        Person person = new Person("Duong Dinh Thu",2023,"0981300594");
        System.out.println("Information :" + person.toString());
        Person person1 = new Person();
        person1.setName("Do Thi Thao");
        person1.setBornYear(2005);
        person1.setPhone("0123456789");
        System.out.println("Information :"+ person1.toString());
        person1.setName("Tran Minh Vu");
        System.out.println("Information :"+ person1.toString());
        System.out.println(person1.getName());
    }
}