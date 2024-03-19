import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

class Account {
    int accountNumber;
    String accountHolderName;
    int balance;

    // Constructor to initialize account details
    public Account(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(int amount) {
        this.balance += amount;
    }

    // Method to withdraw money
    void withdrawal(int amount) {
        this.balance -= amount;
    }

    // Method to get account balance
    int getBalance() {
        return balance;
    }
}

class Transaction {
    int transactionID;
    String date;
    String state;
    int amount;

    // Constructor to initialize transaction details
    public Transaction(int transactionID, String date, String state, int amount) {
        this.transactionID = transactionID;
        this.date = date;
        this.state = state;
        this.amount = amount;
    }

    // Method to print transaction details
    void displayTransaction() {
        System.out.printf("\t%d\t%s\t%s\t%d\n", transactionID, date, state, amount);
    }
}

public class SimpleBankingSystem {

    // ArrayLists to store accounts and transactions dynamically
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static ArrayList<Transaction> transactions = new ArrayList<>();

    // Method for creating account
    public static void createAccount() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Generating a random account number between 8 and 9 digits
        int accountNumber = generateRandomAccountNumber();

        System.out.println("Enter Account Holder Name:");
        String accountHolderName = sc.next(); // Use next() instead of nextLine()

        System.out.println("Enter Initial Balance:");
        int balance = sc.nextInt();

        // Create a new account and add it to the accounts ArrayList
        Account newAccount = new Account(accountNumber, accountHolderName, balance);
        accounts.add(newAccount);

        System.out.println("Your account number is: " + accountNumber);
        System.out.println("Account created successfully!");
    }

    // Method to generate a random account number between 8 and 9 digits
    private static int generateRandomAccountNumber() {
        Random random = new Random();
        int min = 10000000; // 8 digits
        int max = 999999999; // 9 digits
        return random.nextInt(max - min + 1) + min;
    }

    // Method for deleting account
    public static void deleteAccount() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number to Delete:");
        int accountNumberToDelete = sc.nextInt();

        // Using iterator to avoid concurrent modification
        java.util.Iterator<Account> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            Account account = iterator.next();
            if (account.accountNumber == accountNumberToDelete) {
                iterator.remove();
                System.out.println("Account deleted successfully!");
                return;
            }
        }

        System.out.println("Account not found!");
    }

    // Method for performing transaction
    public static void transaction() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accountNumber = sc.nextInt();

        // Find the account with the specified account number
        Account selectedAccount = null;
        for (Account account : accounts) {
            if (account.accountNumber == accountNumber) {
                selectedAccount = account;
                break;
            }
        }

        if (selectedAccount == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.println("Select Transaction Type (1: Deposit, 2: Withdrawal):");
        int transactionType = sc.nextInt();

        System.out.println("Enter Amount:");
        int amount = sc.nextInt();
        

        // Perform the selected transaction and record it
        if (transactionType == 1) {
            selectedAccount.deposit(amount);
            transactions.add(new Transaction(transactions.size() + 1, getCurrentDateTime(), "Deposit", amount));
        } else if (transactionType == 2) {
            selectedAccount.withdrawal(amount);
            transactions.add(new Transaction(transactions.size() + 1, getCurrentDateTime(), "Withdrawal", amount));
        } else {
            System.out.println("Invalid Transaction Type!");
            return;
        }

        System.out.println("Transaction completed successfully!");
        
    }

    // Method to query total balance of all accounts
    public static void queryTotalBalance() {
        int totalBalance = 0;

        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }

        System.out.println("Total Balance of All Accounts: " + totalBalance);
    }

    // Method to get current date and time
    private static String getCurrentDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease enter the correct details:>>");
            System.out.println("Select the correct choice: ");
            System.out.println("1.\tCreate Account");
            System.out.println("2.\tDelete Account");
            System.out.println("3.\tTransaction Related");
            System.out.println("4.\tQuery Total Balance");
            System.out.println("5.\tExit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deleteAccount();
                    break;
                case 3:
                    transaction();
                    break;
                case 4:
                    queryTotalBalance();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close(); // Close the scanner only when exiting the program
                    System.exit(0);
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }
}
