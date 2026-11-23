import java.util.*;

public class VectorAllMethods {
 public static void main(String[] args) {
 Vector<String> v = new Vector<>();
 // add
 v.add("Java");
 v.add("C#");
 v.addElement("Python"); // legacy

//  System.out.println("Vector: " + v);
//  // get
//  System.out.println("Element at 1: " + v.get(1));

//  // set
//  v.set(1, "DotNet");

//  // remove
//  v.remove("Python");
//  v.remove(0);
//  // size
//  System.out.println("Size: " + v.size());
//  // capacity
//  System.out.println("Capacity: " + v.capacity());
//  // contains
//  System.out.println("Contains Java: " + v.contains("Java"));
//  // add more
//  v.add("Java");
//  v.add("Go");
//  // first & last
//  System.out.println("First: " + v.firstElement());
//  System.out.println("Last: " + v.lastElement());

 // Enumeration
 Enumeration<String> e = v.elements();
 System.out.println("Using Enumeration:");
 while (e.hasMoreElements()) {
 System.out.println(e.nextElement());
 }
 // clear
 v.removeAllElements();
 // isEmpty
 System.out.println("Is Empty: " + v.isEmpty());
 }
 }