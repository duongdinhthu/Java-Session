//luôn vết chữ thường chữ cái đầu tiên của package
package demo1;
// luôn viết hoa chữ cái đầu tiên của class
public class Student {
    //Field : Trường / property / thuộc tish / attribute để định nghĩa lên đối tượng và chứa giá trị
    // Tường là privated an toàn d liệu
    //Giá trị gán cho Field thường sử dụng là Setter , giá trị đọc - getter
    private String name;
    private int bornYear;
    private String placeOfBirth;
    // Constructor : Hàm khowri tạo sử dụng để tajo ra đối tợng có các đặc tính ban đầu có thể có đối số hoặc không
    // tên trùng với tn class và không có dữ liệu trả về


    public Student(String name, int bornYear, String placeOfBirth) {
        //this : Đối tượng hiện tại , sử dụng trong chính class đó
        this.name = name;
        this.bornYear = bornYear;
        this.placeOfBirth = placeOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

}
