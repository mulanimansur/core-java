public class methodargue {


public static void main(String[] args) {

    calculator1 obj = new calculator1();

    System.out.println(obj.add(10, 10));
    System.out.println(obj.add(10, 10, 10, 10, 10));
    System.out.println(obj.add(10, 20, 30, 40, 50));
    System.out.println(obj.add());
}
}

class calculator1 {


public int add(int... numbers) {

    int sum = 0;

    for (int num : numbers) {
        sum += num;
    }

    return sum;
}


}

