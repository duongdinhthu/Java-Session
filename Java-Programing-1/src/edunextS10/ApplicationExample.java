package edunextS10;

import java.util.ArrayList;

public class ApplicationExample {
    public static void main(String[] args) {
        Student student = new Student(1,"Ngoc",20);
        ArrayList<Student> listStudent = new ArrayList<>();
        //them sinh vien vao list, co 2 cach
        listStudent.add(student);
        listStudent.add(new Student(2,"Binh",40));
        listStudent.add(new Student(3,"Banh",40));
        listStudent.add(new Student(4,"Benh",40));
        listStudent.add(new Student(5,"Banh",40));
        for (Student std: listStudent){
            System.out.println(std);
        }
        System.out.println("Tim kiem sv");
        for (int i = 0; i <listStudent.size();i++){
            if (listStudent.get(i).name.contains("Binh")){
                System.out.println(listStudent.get(i).name);
                listStudent.remove(listStudent.get(i));
            }
        }
        System.out.println("Ds sau khi xoa");
        for (Student list : listStudent){
            System.out.println(list.name);
        }
    }
}
