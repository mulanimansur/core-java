
class parent{
    int balance = 5000;
    void display(){
        System.out.println(balance+ "parent");
    }
}
class child extends parent{
   
    void display(){
        System.out.println(super.balance+ "child");
        super.display();
    }
}


public class superkeyexample {

    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
    
}
