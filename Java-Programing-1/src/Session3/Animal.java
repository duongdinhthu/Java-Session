package Session3;
// khai bao lop
// lớp này có thể cứa 1 hoặc nhiều phương thức abstract cho phép các lớp con kế thừa hoặc thay đổi hành vi
public abstract class Animal {
  private String name;
  public Animal(){
  // gan gia tri mac dinh cho name
//  this.name = "Tom";
      this.name=getAnimalName();
  }

    public Animal(String name) {
      // constructor ny sẽ được gọi trong constructor của lớp dog
        //
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    abstract : đây là lớp trừ tưng - có thể sửa ở lớp con
    // Lowsp con định nghĩa li hành vi mà nó muốn
    // Thể hiện các tính chất đa hình
    // Không chứa mã code bên trong
    // nó phải thuộc về 1 lớp Abstract

    public abstract String getAnimalName();
}
