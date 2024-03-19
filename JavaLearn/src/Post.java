
class Payment {
    // properties
    private double amount;

    // constructors
    public Payment(double amount) {
        this.amount = amount;
    }

    // methods
    public void create() {
        System.out.println("Payment of " + this.amount + " created");
    }

    public String getAmount() {
        return null;
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
    public void addPayment(Payment payment) {
        this.payment = payment;
        System.out.println("Payment of " + payment.getAmount() + " added to sale of " + this.total);
    }
}

public class Post {
    public static void main(String[] args) {
        // create a payment of $100
        Payment payment = new Payment(100.0);
        payment.create();

        // create a sale of $150
        Sale sale = new Sale(150.0);

        // add payment of $100 to sale of $150
        sale.addPayment(payment);
    }
}
