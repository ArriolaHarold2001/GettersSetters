import java.util.Scanner;

class Banking {
    private String username;
    private double balance;
    private int deposit;
    private int withdraw;

    public Banking(String username, double balance, int deposit, int withdraw) {
        this.username = username;
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
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
    // end of setters
}

public class GettersSetters {
    public static void main(String[] args) {
        Banking anonymusRhino = new Banking("Anonymus", 150.00, 0, 0);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a username");
        String inUsername = keyboard.nextLine();
        anonymusRhino.setUsername(inUsername);

        System.out.println("Would you like to Deposit or Withdraw? Yes or No");
        String yes = "Yes";
        String no = "No";
        yes = keyboard.nextLine();
        no = keyboard.nextLine();

        if (keyboard.equals(yes)) {
            System.out.println("Enter an amount to deposit.. Machine cannot take any cents.");
            int inDeposit = keyboard.nextInt();
            anonymusRhino.setDeposit(inDeposit);
            System.out.println("Enter an amount to withdraw.. Machine cannot dispense cents.");
            int inWithdraw = keyboard.nextInt();
            anonymusRhino.setWithdraw(inWithdraw);

            System.out.println("Username Entered: " + anonymusRhino.getUsername());
            System.out.println(anonymusRhino.getUsername() + "Deposited: " + anonymusRhino.getDeposit());
            System.out.println(anonymusRhino.getUsername() + "Withdrew: " + anonymusRhino.getWithdraw());
            System.out.println(anonymusRhino.getUsername() + "'s " + "Current Balance: " + anonymusRhino.getBalance());
        } else if (keyboard.equals(no)) {
            System.out.println("Username Entered: " + anonymusRhino.getUsername());
            System.out.println(anonymusRhino.getUsername() + "'s " + "Current Balance: " + anonymusRhino.getBalance());
        }
    }
}