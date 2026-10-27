public class multipleinheritanceexample {
    

    public static void main(String[] args) {
        smartAccount Ac = new smartAccount();
        Ac.deposit(1000);
        Ac.accountHolderName = "Mansur"; 
        System.out.println("Account Holder: " + Ac.accountHolderName); Ac.deposit(1000);
         Ac.applyLoan(5000);
        
    }
}

interface Accountoperation{
    void deposit(double amount);
}

interface Loanoperation{
    void applyLoan(double amount);
}
class smartAccount implements  Accountoperation, Loanoperation{
    String accountHolderName;
    double balance;

    public void  deposit(double amount){
        balance += amount;
        System.out.println(amount + " " +balance);
    }

     public void  applyLoan(double amount){
        balance += amount;
        System.out.println("Loan Approved: " +amount  + ".new balance: " + balance);
    }
}