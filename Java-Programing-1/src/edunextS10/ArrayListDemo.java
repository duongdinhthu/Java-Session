package edunextS10;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    // khoi tao
    public static void arrayListMethod(){
        // ArrayList tao bang 2 cach
        // Cach 1
        ArrayList<String> student = new ArrayList<>();
        //cach 2
        List<String> animal = new ArrayList<>();
        //Them phan tu vao array list
        student.add("Ngoc");
        student.add("Vinh");
        student.add("Hung");
        student.add("Hai");
        student.add("Dat");
        // hien thi thong tin
//        System.out.println(student);
show(student);
student.add(2,"Thu");
        System.out.println("-----------------------");
        display(student);
        System.out.println("-----------------------");
        student.addFirst("Manh");// chen them 1 phan tu vao index
        display(student);
        System.out.println("-----------------------");
        student.addLast("Duong");
        display(student);
        // lay 1 phan tu theo index
        String st = student.get(1);
        System.out.println("Phan tu co index = 1:" + st);
        System.out.println("-----------------------");
// lay phan tu dau tien
        String firstStudent = student.getFirst();
        System.out.println("Sinh vien dau tien: " + firstStudent);
        System.out.println("-----------------------");
        student.set(4,"ok");
        System.out.println("Sinh vien co index = 4 da duoc sua thanh :" + student.get(4));
        // phan tu cuoi cung laf get Last
// xoa phan tu dau tien va lay ra

        student.remove(0);
        // xoa toan bo:
        student.clear();
        int size = student.size();
        System.out.println(size);
    }

    public static void display(ArrayList list){
for (int i = 0 ; i < list.size();i++){
    System.out.println(list.get(i));

}
    }
    public static void show(ArrayList list){// for each là sử dụng vòng lựap từng phần tử cho 1 marng
        // su dung for-each
        for (Object arrList : list){// ben trai la ten dai dien cho 1 phan tu , ben phai la danh sach chua doi tuong ben trai
            System.out.println(arrList);
        }
    }

    public static void main(String[] args) {
arrayListMethod();
    }
}
