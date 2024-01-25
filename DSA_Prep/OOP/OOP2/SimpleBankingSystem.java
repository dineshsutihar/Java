package DSA_Prep.OOP.OOP2;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Scanner;


// Account Class
class Account{
    int size = 50;
   int[] accountNumber = new int[size];
   String[] accountHolderName = new String[size];
   int[] balance=new int[size];
   
   void deposit(int amount, int index){
    this.balance[index]=balance[index]+amount;
   }

   void withdrawal(int amount, int index){
    this.balance[index]=balance[index]-amount;
   }

   int getAmount(int index){
    return balance[index];
   }
}

// Transection Class
class Transection{
    int[] transectionID=new int[50];
    String[] date = new String[50];
    int[] amount = new int[50];


    // to print all the transection details
    void getTransection(){
        
    }

    // To record the transections.
    void setTransection(int index){
        // setting time and date
        SimpleDateFormat formatter = new SimpleDateFormat();
        Date dt = new Date();
        this.date[index]=formatter.format(dt);




    }
}

// Bank class: TO MANAGE COLLECTIONS OF ACCOUNTS;
// Main Class
public class SimpleBankingSystem {

   
    // method for creating account
    public static void createAccount (){

    }

    // method for deleting account
    public static void deleteAccount (){

    }

    // method for performing transection
    public static void transection (){

    }


    // Main method here:
    public static void main(String[] args) {
        // Taking user input 
        System.out.println("Please enter the correct details:>>");

        Scanner sc = new Scanner(System.in);

        System.out.println("Select the correct choice: \n");
        System.out.printf("1.\tCreate Account.\n2.\tDelete Account.\n3.\tTransection Related.\n");
        
        int option = sc.nextInt();

        switch (option) {
            case 1: createAccount ();
                break;
            
            case 2: deleteAccount();
                break;

            case 3: transection();
                break;
        
            default: 
                System.out.println("Invalid Input.");
                break;
        }



        sc.close();
    }


    
    


}