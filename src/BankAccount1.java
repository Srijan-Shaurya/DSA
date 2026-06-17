public class BankAccount1 {

    // Ye object ke data (fields) hain
    private int accountNumber;
    private int balance;

    // Constructor
    // Jab object banega tab ye automatically chalega
    BankAccount1(int accNo, int balNo) {

        // Constructor ko jo values mili hain
        // unhe object ke fields me store kar rahe hain

        accountNumber = accNo;
        balance = balNo;
    }

    // Deposit method
    // Sirf amount receive karega
    // Balance already object ke andar stored hai
    public void deposit(int amount) {

        // Current balance me amount add kar do
        balance = balance + amount;
    }

    // Withdraw method
    public void withdraw(int amount) {

        // Check karo ki balance enough hai ya nahi
        if (balance >= amount) {

            balance = balance - amount;

            System.out.println("Withdrawal Successful");
        } else {

            System.out.println("Insufficient Balance");
        }
    }

    // Balance dekhne ke liye method
    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        // Object create kiya
        // Constructor ko 1 aur 2000 pass kiya

        BankAccount1 acc1 = new BankAccount1(1, 2000);

        // Initial balance
        System.out.println("Current Balance: " + acc1.getBalance());

        // 500 deposit
        acc1.deposit(500);

        System.out.println("Balance After Deposit: "
                + acc1.getBalance());

        // 300 withdraw
        acc1.withdraw(300);

        System.out.println("Balance After Withdraw: "
                + acc1.getBalance());
    }
}