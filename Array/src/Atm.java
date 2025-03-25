import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm {
    private static double balance = 0; // Initial account balance

    public static void main(String[] args) {
    	try {
    		Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the ATM!");
            while (true) {
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        deposit(depositAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }catch(InputMismatchException e) {
        	System.out.println("Enter the integer value!");
        }
    	catch(Exception e) {
        	System.out.println(e);
        }
    	}
        

    public static void checkBalance() {
        System.out.println("Your balance is $" + balance);
    }

    public static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawn $" + amount);
            System.out.println("Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static void deposit(double amount) {
        balance += amount;
        System.out.println("You have deposited $" + amount);
        System.out.println("Updated balance: $" + balance);
        System.out.println(balance);
    }
}
    
