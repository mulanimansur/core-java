class Account {
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;

        System.out.println("Deposited: " + amount
                + " | Account Holder: " + accountHolderName
                + " | New Balance: " + balance);
    }

}

// Derived class
class SavingAccount extends Account {
    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;

        System.out.println("Interest Added: " + interest
                + " | Account Holder: " + accountHolderName
                + " | New Balance: " + balance);
    }

}

// Multilevel inheritance
class PremiumSavingAccount extends SavingAccount {
    double cashbackRate;

    void applyCashback() {
        double cashback = balance * cashbackRate / 100;
        balance += cashback;

        System.out.println("Cashback Added: " + cashback
                + " | Account Holder: " + accountHolderName
                + " | New Balance: " + balance);
    }

}

// Hierarchical inheritance
class CurrentAccount extends Account {
    double overdraftLimit;

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;

            System.out.println("Withdrawn: " + amount + " | Account Holder: " + accountHolderName
                    + " | New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

}

public class haricalinheritance {
    public static void main(String[] args) {

        // Current Account
        CurrentAccount obj = new CurrentAccount();

        obj.accountHolderName = "Mansur";
        obj.balance = 1000;
        obj.overdraftLimit = 1000;

        obj.withdraw(2000);

        // Saving Account
        SavingAccount obj2 = new SavingAccount();

        obj2.accountHolderName = "Mansur";
        obj2.balance = 1000;
        obj2.interestRate = 5;

        obj2.applyInterest();
    }

}

// base class

// class Account{
// String accountHolderName;
// double balance;

// void deposit(double amount) {
// balance += amount;
// System.out.println("Deposited "+amount +"in :" + accountHolderName + "
// account.New Balance is:" + balance);
// }
// }

// // derived class

// class savingAccount extends Account{
// double intrestRate;
// void applyInterest() {
// double interest = balance * intrestRate /100;
// balance += interest;
// System.out
// .println("Deposited "+interest +"in : " + accountHolderName + " account.New
// Balance is: " + balance);

// }
// }

// // multilabel

// class premiumsavingAccount extends savingAccount{
// double cashbackRate;

// void applycashback() {
// double cashback = balance * cashbackRate /100;
// balance += cashback;
// System.out
// .println("Deposited "+ cashback +"in : " + accountHolderName + " account.New
// Balance is: " + balance);

// }
// }
// class currentAccount extends Account{
// double overdraftlimit;
// void withdraw(double amount){

// if (amount<= overdraftlimit + balance) {
// balance-=amount;
// System.out.println(accountHolderName + " account.New Balance is: " +
// balance);

// }else{
// System.out.println("overdraft limit exceed!!");

// }

// }

// }

// public class haricalinheritance {

// public static void main(String[] args) {
// premiumsavingAccount obj = new premiumsavingAccount();
// currentAccount obj2 = new currentAccount();

// obj.accountHolderName = "Mansur";
// obj.balance = 1000;
// obj.cashbackRate=2;

// obj.deposit(1000);
// obj.applycashback();

// }

// }