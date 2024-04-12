package edunextS12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//khai bao 1 class CustomerException ke thua lop cha Exception
class CustomException extends Exception{
    //khai bao 1 bien co kieu du lieu long , khong the sua ( final)
    // chi duoc su dung trong class(private) va co the goi khong can doi tuong( static)
    private static final long serialVersionUIO = 1L;
    public CustomException(String str){
        super();
        System.out.println(str);
        EmployeeSystem.operations();
    }
}
public class EmployeeSystem {
public static Map<Integer,Employee> map = new HashMap<>();

    public static void addEmployee(String name,int age,int id) {
        Employee emp = new Employee(name,age,id);
        map.put(id,emp);
        operations();
    }

    public static void deleteEmployee(int EmId) throws CustomException {
        if(map.containsKey(EmId)){
            map.remove(EmId);
            System.out.println("Succesfully deleted from the list !!");
        }else {
            throw new CustomException("Not Found Exception");
        }
        operations();
    }

    public static void searchEmployee(int EmId) throws CustomException {
        if (map.containsKey(EmId)){
            //map get(EmId)
            System.out.println("Employee Detail :" + map.get(EmId));
        }else {
            throw new CustomException("Not found exception");
        }
        operations();
    }
    public static void employeeList(){
        System.out.println(map.toString());
    }
    public static void operations(){
        System.out.println("***** Employee management system *****");
        System.out.println("1.Add employee");
        System.out.println("2.Delete employee");
        System.out.println("3.Search employee");
        System.out.println("4.List employee");
        Scanner scanner = new Scanner(System.in);
        int useInput = scanner.nextInt();
        if (useInput == 1){
            System.out.println("Enter employee details( name , age,id):");
            Scanner scanner1 = new Scanner(System.in);
            String name = scanner1.next();// tra ve chuoi ki tu co dau cach
            int age = scanner1.nextInt();
            int id = scanner1.nextInt();
            if(!name.equals("") && age != 0 && id != 0){
                addEmployee(name,age,id);
            }
        } else if (useInput == 2) {
            System.out.println("Enter Employee Id: ");
            Scanner scanner1 = new Scanner(System.in);
            int EmId = scanner1.nextInt();
            try {
                deleteEmployee(EmId);
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }

        } else if (useInput == 3) {
            System.out.println("Enter Employee ID:");
            Scanner scanner1 = new Scanner(System.in);
            int EmId = scanner1.nextInt();
            try {
                searchEmployee(EmId);
            }catch (CustomException e){

            }
            operations();
            
        } else if (useInput == 4) {
            employeeList();
            operations();
        }
    }

    public static void main(String[] args) {
        operations();
    }
}
