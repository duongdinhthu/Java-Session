package setInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

// duy trì các thứ tự chèn, k trùng nhau
//cho phép phần tử null
public class LinkedHashSetExample {
    public static void linkedHashSet(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        //add
        linkedHashSet.add("java");
        linkedHashSet.add("C#");
        linkedHashSet.add("html");
        linkedHashSet.add("python");
        linkedHashSet.add("ASP.Net");
        linkedHashSet.add("ASP.Net");
        System.out.println(linkedHashSet);
        System.out.println("======================");
        //check tồn tại kểm tra
        String b = "java";
        boolean a = linkedHashSet.contains(b);
        if( a == true) {
            linkedHashSet.remove(b);
        }
        for (String s : linkedHashSet){
            System.out.println(s);
        }
        System.out.println("================================");
        //Iterator : dùng để lặp trong 1 tập hợp
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        linkedHashSet();
    }
}
