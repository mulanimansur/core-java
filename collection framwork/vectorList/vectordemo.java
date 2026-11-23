
import java.util.*;

public class vectordemo {
    public static void main(String[] args) {

        Vector<String> list = new Vector<>();

        // Adding elements
        list.add("Java");
        list.add("C#");
        list.add("Paython");
        
        // Display Vector
        System.out.println(list);

        // Access element
        System.out.println(list.get(0));

   
    }
}