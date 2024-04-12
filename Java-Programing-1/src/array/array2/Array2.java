package array.array2;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array2 {
    // kieu nguyen thuy int . char. double , string
    // kieu class  ( kieu tham chieu)Interger,Float,Double,String
    // truong hop dac biet string chi duoc phep dung String kieu class.
    // String, StringBuffer,StringBuilder
    public static void main(String[] args) {
        int[] numbers = new int[]{25,35,12,3,43,55};
        Integer[] nums = {3,2,3,4,7,5,4};
        Arrays.sort(numbers);
Arrays.sort(nums, Collections.reverseOrder());
        for (int num : numbers){
            System.out.println(num);
        }

    }
}
