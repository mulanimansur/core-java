import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Ethan");
        names.add("Fiona");
        names.add("George");
        names.add("Hannah");
        names.add("Ian");
        names.add("Julia");
        System.out.println("Size of List: " + names.size());
        names.remove("Charlie");
        System.out.println("Size of List after removing Charlie: " + names.size());
        
        System.out.println(names.get(2));//this will print "Diana"

        System.out.println("index of diana is: " + names.indexOf("Diana"));
        System.out.println(names.isEmpty());//this will print false
        
        names.remove("all names");
         System.out.println("Size of List after removing all names: " + names.size());


    //   for (int i = 0; i < names.size(); i++) {
    //         System.out.println(names.get(i));
    //     }


     for (String name : names) {
            System.out.println(name);
        }
         
    }
}