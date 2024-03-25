package Session3;

public class PhuQuocDog extends Dog{
    public PhuQuocDog(String name, int height, int age) {
        super(name, height, age);
    }
    @Override
    public String getAnimalName() {
      //  return super.getAnimalName(); cách gọi này sẽ lấy giá trị default của lớp f0
        //Thể hiện theo cách mà đối tượng muốn
        return "Phu Quoc Dog";
    }
}
