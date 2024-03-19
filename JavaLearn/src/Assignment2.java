
class Payment {
    // properties
    private double amount;

    // constructors
    public Payment(double amount) {
        this.amount = amount;
    }

    // getter method for amount
    public double getAmount() {
        return this.amount;
    }

    // methods
    public void create() {
        // implementation for creating payment
        System.out.println("Payment of " + this.amount + " created");
    }
}

class Sale {
    // properties
    private double total;
    @SuppressWarnings("unused")
    private Payment payment;

    // constructors
    public Sale(double total) {
        this.total = total;
    }

    // methods
    public void create() {
        // implementation for creating sale
        System.out.println("Sale of " + this.total + " created");
    }

    public void makePayment() {
        // create a new payment
        Payment payment = new Payment(100.0);
        payment.create();

        // add payment to sale
        this.payment = payment;
        System.out.println("Payment of " + payment.getAmount() + " added to sale of " + this.total);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        // create a sale of $150
        Sale sale = new Sale(150.0);
        sale.create();

        // make a payment of $100 on the sale
        sale.makePayment();
    }
}
