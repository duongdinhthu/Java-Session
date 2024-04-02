package edunextS9;

public class PlayerTest {
    public static void main(String[]args){
        TournamentIncome tournamentIncome = new TournamentIncome("9","9","Thu");
        PlayerIncome playerIncome = new PlayerIncome("Thu",5000);
        System.out.println("Thưởng giải đấu: " + tournamentIncome.calculateGradeBonus(100) + " $");
        System.out.println("Thưởng cá nhân : " + playerIncome.calculateTax()+" $");
    }
}
//Trong lập trình hướng đối tượng, Polymorphism (đa hình) là khả năng của một đối tượng có thể hiểu và xử lý dữ liệu theo nhiều cách khác nhau tùy theo loại đối tượng đó. Inheritance (kế thừa) là một khái niệm trong lập trình hướng đối tượng cho phép một lớp con kế thừa các thuộc tính và phương thức từ lớp cha của nó.
//
//Polymorphism thường được xem là một hệ quả của Inheritance trong lập trình hướng đối tượng. Khi một lớp con kế thừa từ một lớp cha, nó có khả năng sử dụng các phương thức và thuộc tính của lớp cha đó. Việc sử dụng đa hình cho phép các đối tượng của lớp con có thể thực hiện các phương thức của lớp cha theo cách riêng của chúng, tùy thuộc vào cách mà lớp con đã định nghĩa lại (override) các phương thức đó.
//
//Như vậy, Polymorphism có thể xem là một hệ quả tự nhiên của việc sử dụng Inheritance trong lập trình hướng đối tượng.

