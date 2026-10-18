
// base class

class Account{
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited "+amount +"in :" + accountHolderName + " account.New Balance is:" + balance);
    }
}


// derived class

class savingAccount extends Account{
    double intrestRate;
    void applyInterest() {
        double interest = balance * intrestRate /100;
        balance += interest;
        System.out
                  .println("Deposited "+interest +"in : " + accountHolderName + " account.New Balance is: "  + balance);

    }
}

// multilabel

class premiumsavingAccount extends savingAccount{
    double cashbackRate;

    void applycashback() {
        double cashback = balance * cashbackRate /100;
        balance += cashback;
        System.out
                  .println("Deposited "+ cashback +"in : " + accountHolderName + " account.New Balance is: "  + balance);

    }
}





public class multi {

    public static void main(String[] args) {
        premiumsavingAccount obj = new premiumsavingAccount();
        obj.accountHolderName = "Mansur";
        obj.balance = 1000;
        obj.cashbackRate=2;


        obj.deposit(1000);
        obj.applycashback();

       
        
    }

    
}