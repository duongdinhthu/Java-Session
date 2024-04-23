package setInterface;

import java.util.SortedSet;
import java.util.TreeSet;
// sorted Set sắp xếp tăng dần k trùng nhau
public class SortedSetExample {
    public static void sortedSet(){
        // Khai bao sorted Set
        SortedSet<String> st = new TreeSet<String>();
        //add() methodto add element
        st.add("vinh");
        st.add("van");
        st.add("ngoc");
        st.add("hai");
        st.add("anh");
        st.add("hoang");
        for (String s : st){
            System.out.println(s);
        }
        //remove the element
        st.remove("ngoc");
        st.add("anh");
        System.out.println(st);
    }
    public static void main(String[] args) {
        sortedSet();
    }
}
