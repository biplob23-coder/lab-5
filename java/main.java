class main {
    public int accNo;
    private int balance;

    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Withdraw amount exceed");
        } else {
            System.out.println("amount withdrawn: " + amount);
            balance -= amount;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        bank obj1 = new bank();

        obj1.accNo = 10;

        obj1.setBalance(100);

        obj1.deposit(200);

        System.out.println("Balance of Obj1: " + obj1.getBalance());

        obj1.withdraw(50);

        System.out.println("Balance of Obj1: " + obj1.getBalance());
    }
}