package book;

import java.util.ArrayList;
import java.util.Scanner;

public class Member extends Library  {
    private String name;
    private String classCode;

    public Member(String name, String classCode) {
        this.name = name;
        this.classCode = classCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", classCode='" + classCode + '\'' +
                '}';
    }

    static  ArrayList<Member> students = new ArrayList<>();
public static void addStudent(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the name student:");
    String name = scanner.nextLine();
    System.out.println("Enter the student class: ");
    String classCode = scanner.nextLine();
    Member add = new Member(name,classCode);
    students.add(add);
}
public static void showStudent(){
    for (Member student : students){
        System.out.println(student);
    }
}
}
