import java.util.*;

public class LinkedListAllMethods {
 public static void main(String[] args) {
 LinkedList<String> list = new LinkedList<>();
 // add
 list.add("Java");
 list.add("C#");
 list.add("Python");

 // addFirst / addLast
 list.addFirst("Start");
 list.addLast("End");
 System.out.println("List: " + list);
 // get
 System.out.println("get(2): " + list.get(2));
 System.out.println("First: " + list.getFirst());
 System.out.println("Last: " + list.getLast());
 // set
 list.set(2, "DotNet");
 System.out.println("List: " + list);
 // remove
 list.remove();
 list.removeFirst();
 list.removeLast();
 list.remove(1);
 System.out.println("After remove: " + list);
 // contains
 System.out.println(list.contains("Java"));
 // size
 System.out.println("Size: " + list.size());
 // addAll
 LinkedList<String> list2 = new LinkedList<>();
 list2.add("Go");
 list2.add("Rust");
 list.addAll(list2);

 // removeAll
 list.removeAll(list2);
 // retainAll
 list.add("Java");
 list.retainAll(Collections.singleton("Java"));
 System.out.println("After retainAll: " + list);
 // queue methods
 list.offer("New");
 System.out.println("Peek: " + list.peek());
 System.out.println("Poll: " + list.poll());

 // clear
 list.clear();
 System.out.println("List: " + list);
 // isEmpty
 System.out.println("Is Empty: " + list.isEmpty());
 }
}