
class encapsulationexample {

    private String accountHolderName;
    private double balance;

    // Constructor
    encapsulationexample(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    // Getter
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(balance);
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(balance);
        }
    }

    // Main method
    public static void main(String[] args) {

        encapsulationexample obj =
                new encapsulationexample("Mansur", 5000);

        System.out.println("Account Holder: " + obj.getAccountHolderName());
        System.out.println("Balance: " + obj.getBalance());

        obj.deposit(2000);
        obj.withdraw(1000);

        System.out.println("Final Balance: " + obj.getBalance());
    }
}

