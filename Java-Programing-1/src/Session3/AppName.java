package Session3;

public class AppName {
    public static void main(String[] args) {
        Dog quick = new Dog("Quick",5,12);
        quick.getAnimalName();
        System.out.println("Name:" + quick.getName());
        System.out.println("Animal name:" + quick.getAnimalName());
        Cat meo = new Cat("Thao",9.5,3,true);
        meo.getAnimalName();

        System.out.println("==================================");
        System.out.println("Name:" + meo.getName() +"  Age: "+ meo.getAge() +"  Height: "+ meo.getHeight() +" Sleep during the day:"+ meo.isSleepDay());
        System.out.println("Animal name:" + meo.getAnimalName());
// thể hện tính đa hình
        Dog quick2 = new PhuQuocDog("Vu",15,3);
        System.out.println("==================================");
        System.out.println("Name:" + quick2.getName() +"  Age: "+ quick2.getAge() +"  Height: "+ quick2.getHeight());
        System.out.println("Animal name:" + quick2.getAnimalName());
    }
}
