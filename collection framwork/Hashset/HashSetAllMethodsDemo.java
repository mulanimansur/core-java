import java.util.HashSet;
import java.util.Iterator;

public class HashSetAllMethodsDemo {

    public static void main(String[] args) {

        // 1. Create HashSet
        HashSet<String> set = new HashSet<>();

        // 2. add()
        set.add("Java");
        set.add("C#");
        set.add("Python");
        set.add("Java"); // duplicate (ignored)

        System.out.println("After add(): " + set);

        // // 3. size()
        // System.out.println("Size: " + set.size());

        // // 4. contains()
        // System.out.println("Contains Java? " + set.contains("Java"));

        // // 5. remove()
        // set.remove("C#");
        // System.out.println("After remove(): " + set);

        // // 6. isEmpty()
        // System.out.println("Is Empty? " + set.isEmpty());

        // 7. iterator()
        System.out.println("Using Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // // 8. for-each loop
        // System.out.println("Using for-each:");
        // for (String value : set) {
        // System.out.println(value);
        // }

        // // 9. addAll()
        // HashSet<String> set2 = new HashSet<>();
        // set2.add("Spring");
        // set2.add("Hibernate");

        // set.addAll(set2);
        // System.out.println("After addAll(): " + set);

        // // 10. removeAll()
        // set.removeAll(set2);
        // System.out.println("After removeAll(): " + set);

        // // 11. retainAll()
        // HashSet<String> set3 = new HashSet<>();
        // set3.add("Java");
        // set3.add("Go");

        // set.retainAll(set3);
        // System.out.println("After retainAll(): " + set);

        // // 12. clone()
        // HashSet<String> clonedSet = (HashSet<String>) set.clone();
        // System.out.println("Cloned Set: " + clonedSet);

        // // 13. clear()
        // set.clear();
        // System.out.println("After clear(): " + set);

        // // 14. equals()
        // System.out.println("Is clonedSet equal to set? " + clonedSet.equals(set));

        //15. hashCode()
        System.out.println("HashCode of clonedSet: " + set.hashCode());
    }
}