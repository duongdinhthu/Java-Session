package exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication {
    //khối lệnh thực hiện finnaly ( luôn lun thực hiện )
    //try {
    // code có theer ném ra ngoại lệ
//} catch ( Exception_ class _ me ){
    //code xử lí ngoại lệ
//} finally {
    // code trong khối này luôn đuuowjc thực thi

    //}
    //1 số phương thức của lớp exception
    //getMessage(): Trả veef 1 message cụ the về exceptiondđã xảy ra
    //getCause(): Trả về nguyên nhân xảy ra Exception
    //toString(): Trả về tên của lớp và kết hợp với kết quả tuwf phương thức getMessage();
    //printStackTrace(): In ra kết quả của phương thức toString() cùng với stack Tracedđến System.err
    //fillInStackTrace(): Làm đầy stack trace của đối tượng . Throwable bằng stacktrace hiện tại

//Throw và Throws
//Từ khoá throw trong java được sử dụng để ném ra một ngoại lệ ( Exception cụ thể)
//    Chúng ta ôs thể nem ra 2 ngoai leej checked va unchecked trong java bawfng tu khoas throw
//tu khoa throw chu yeu duoc su dung de nem ra ngoai le tuy chinh ( ngoai le do nguoi dung dinh nghia)
//    Sau throw la 1 hoac nhieu instance
//khong the throw nhieu exception
//
//
//
//
//    Tu khoa Throws  trong java duoc su dung khi ban khong muon phai xay dung try - catch ben trong mot phuong thuc nao do.
//ban day tranh nhiem phai try - catch nay cho phuong thuc nao do ben ngoai co goi den no phai try-catch giup ban
//        Sau cau lenh Throws nay la 1 hoac nhieu class
//co the khai bao nhieu exception
//vi du: public void methodName( )throws IOException, SQLException{......}


    public static void main(String[] args) throws Exception {// static co the goi qua truc tiep ma khoong can phai thong qua khoi tao doi tuong
//ThrowDemo.validate();
//        ThrowsDemo.getAge();
        //Custom exception
        try{
int age = inputAge();
            System.out.println("Tuoi da nhap: " + age);
        }catch (AgeCheckingExc e){
            System.out.println(e.getMessage());
        }

    }
    static int inputAge() throws AgeCheckingExc{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            if (age<0) throw new AgeCheckingExc("Tuoi khong duoc nho hon 0");

        }catch (InputMismatchException e){
            throw new AgeCheckingExc("Tuoi phai la so : ");

        }
        return age;
    }
}

