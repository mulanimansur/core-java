// Base class
class Account {
    String accountHolderName;
    double balance;
    void deposit(double amount) {
        balance += amount; //baalance = balance + amount  
        System.out.println("Deposited"+ amount + "in :" + accountHolderName + "account. New Balance is :" + balance);
    }
}

// Derived class
class SavingAccount extends Account{
     double InterestRate;
     void applyInterest(){
        double interest = balance * InterestRate / 100;
        balance += interest;
        
        System.out.println("Deposited"+ interest + "in :" + accountHolderName + "account. New Balance is :" + balance);
        
     }
}


public class Singleinheritance{
    public static void main(String[] args){
         SavingAccount obj = new SavingAccount();
         obj.accountHolderName = "Mansur";
         obj.balance =  1000;
         obj.deposit(1000);
         obj.InterestRate = 5;
         obj. applyInterest();
    }
}