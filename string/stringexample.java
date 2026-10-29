public class stringexample {

public static void main(String[] args) {

    String name = "mansur";

    System.out.println(name.charAt(2));
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.trim());
    System.out.println(name.length());

    System.out.println(name.substring(3));
    System.out.println(name.substring(2, 5));
    System.out.println(name.replace('a', 'o'));

    System.out.println(name.startsWith("ma"));
    System.out.println(name.contains("ma"));

    String s = "Geeks for Geeks";

    String[] arr = s.split(" ");

    for (String str : arr) {
        System.out.println(str);
    }
}


}
