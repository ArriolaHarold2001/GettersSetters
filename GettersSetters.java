import java.util.Scanner;

class Banking {
    private String username;
    private double balance;
    private int deposit;
    private int withdraw;
    private int passcode;

    public Banking(String username, double balance, int deposit, int withdraw, int passcode) {
        this.username = username;
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.passcode = passcode;
    }

    // getters
    public String getUsername() {
        return this.username;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getDeposit() {
        return this.deposit;
    }

    public int getWithdraw() {
        return this.withdraw;
    }

    public int getPasscode() {
        return this.passcode;
    }

    // end of getters
    // setters
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void setDeposit(int newDeposit) {
        this.deposit = newDeposit;
    }

    public void setWithdraw(int newWithdraw) {
        this.withdraw = newWithdraw;
    }

    public void setPasscode(int newPasscode) {
        this.passcode = newPasscode;
    }
    // end of setters
}

public class GettersSetters {
    public static void main(String[] args) {
        Banking anonymusRhino = new Banking("Harold Arriola", 150.00, 0, 0, 15476);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter passcode: ");
        int inPasscode = keyboard.nextInt();
        if (inPasscode == anonymusRhino.getPasscode()) {
            // asks for a deposit
            double currentBalance = anonymusRhino.getBalance();
            System.out.printf("Your Current Balance: " + "%.2f", currentBalance);
            System.out.println("\n");
            System.out.println("How much would you like to Deposit?");
            double depositAmount = keyboard.nextDouble();
            // asks for a withdraw
            System.out.println("How much would you like to Withdraw");
            double withdrawAmount = keyboard.nextDouble();
            // calculating the total amount
            double totalBalance = (double) ((anonymusRhino.getBalance()) + (depositAmount - withdrawAmount));
            System.out.println("Passcode Entered: " + inPasscode);
            System.out.printf("Amount Deposited: " + "%.2f", depositAmount);
            System.out.println("\n");
            System.out.printf("Withdraw Amount: " + "%.2f", withdrawAmount);
            System.out.println("\n");
            System.out.printf("Your total balance is now: " + "\n" + "%.2f", totalBalance);
        } else {
            System.out.println("ERROR: Username is not Recognized");
        }
    }
}