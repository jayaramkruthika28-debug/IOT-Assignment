package m3;

public class BankAccount {
        private String accountNumber;
        private double balance;
        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + " into account " + accountNumber);
        }
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient balance in account " + accountNumber);
            }
        }
        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {

            BankAccount acc = new BankAccount("12345", 1000);

            acc.deposit(500);
            acc.withdraw(300);

            System.out.println("Current Balance: " + acc.getBalance());
        }
    }