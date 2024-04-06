package exception;

public class TryCatchDemo {
    public static void tryCatchDemo(){
        int a = 20 ;
        int b = 0;
        try {
int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("khong the chia cho 0" + e.getMessage());
        }finally {
            System.out.println("Khoi lenh nay luon duoc thuc thi");
        }
    }
    public static void tryCatchFinally(){
        /* try catch long nhau
        Khi khoi try catch long trong 1 kho try catch khac
        su dung khi tinh huong co the phat sinh trong do co 1 phan cua khoi co the gay ra loi
         */

    }
    public static void nestedTryCatchDemo(){
try {
    try {
        System.out.println("Thuc hien phep chia");
        int b = 1000/0;
    }catch (ArithmeticException e){
        System.out.println(e.getMessage());
    }
    try {
        int a[]= new int[10];
        a[10] = 20;
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }
}catch (Exception e){
    System.out.println("Kiem soat duoc loi:" );
}
        System.out.println("Luong chay binh thuong");
    }
}
