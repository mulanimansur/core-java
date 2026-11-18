
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount{
    int balance = 5000;
    void withdraw(int amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
    }
}

public class customExceptionBankDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(6000); // This will throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    

