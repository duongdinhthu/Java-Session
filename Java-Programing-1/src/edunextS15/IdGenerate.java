package edunextS15;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private static Long id = 0L;
    private static ReentrantLock lock = new ReentrantLock();
    public static Long getNewId(){
        Long result;
        lock.lock();// khoa bien id lai chi cho duy nhat 1 thread duoc truy xuat cap
        //de tranh tinh trang data Racing!
        try {
            result = ++id;// tang roi gan vao bien result
        }finally {
            lock.unlock();// tang roi thi mo lock cho cac thread khac cung truy cap
            // nhieu nhu minh di nha ve sinh xong thi ra
        }
        return result;
    }
    private IdGenerate(){}
}
