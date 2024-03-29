package edunextS8;

public class Client {
    /**
     * Constructor for objects of class Client
     */
    public Client() {
        // To do:
    }

    public void doUnchecked(String value) {
        // Can phai check exception, neu khong --> bug
        int result = canThrowUncheckedException(value);
        System.out.println("result=" + result);
    }

    private int canThrowUncheckedException(String value) {
        return Integer.parseInt(value);
    }
//canThrowUncheckedException ném ra một unchecked exception vì nó không khai báo bất kỳ checked exception nào bằng từ khóa throws.
    public void doChecked() {
        try {
            // Buoc phai check exceptions o day! Khong cach nao khac
            canThrowCheckedException();
            System.out.println("OK");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private int canThrowCheckedException() throws Exception {
        throw new Exception("Failure");
    }
}
//Phương thức canThrowCheckedException ném ra một checked exception vì nó khai báo rằng nó có thể ném ra một Exception bằng từ khóa throws