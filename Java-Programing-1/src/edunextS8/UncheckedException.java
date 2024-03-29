package edunextS8;
import java.util.Scanner;
public class UncheckedException {
    public UncheckedException() {
    }
        public static void main(String[] args) {
int i , n = 2;
int a[] = new int[n];
for (i = 0 ; i <= n ;i++){
    System.out.printf("a[%d] = ", i);
}
        }
}
// có 3 lỗi xảy ra . 1 là đã khai báo mảng a với 2 phần tử , nếu truy cập quá phn tử sẽ gây ra lỗi
// 2 là phương thức input chuwa được khai báo trong thư viện nên chương trình không biên dịch đợc phương thức này
// 3 là neesu nhập vào 1 kí tự khác số nguyên , chương trình sẽ bị lỗi