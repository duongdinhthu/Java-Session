package demo1;

public class ClientApplication {
    public static void main(String[] args) {
        // new là khởi tạo và cấp phát bộ nhớ cho đi tượng student
        Student student = new Student("Duong Dinh Thu",1990,"Thai Binh");
        System.out.println("Student information: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Year " + student.getBornYear());
        System.out.println("Place " + student.getPlaceOfBirth());
    }
}
