package exception;
//Customer exception
// Ngoai le do nguoi dung dinh nghia
public class AgeCheckingExc extends Exception {
    // day la phương thuc  do nguoi dung tu dinh nghia
    public AgeCheckingExc(String message){
        super(message);

    }

    @Override
    public String getMessage() {
        return "Loi nhap vao tuoi" + super.getMessage();
    }
}
