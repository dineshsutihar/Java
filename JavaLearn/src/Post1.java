
class Payment1 {
    // properties
    private double amount;

    // constructors
    public Payment1(double amount) {
        this.amount = amount;
    }

    // methods
    public void create() {
        System.out.println("Payment of " + this.amount + " created");
    }

    public double getAmount() {
        return amount;
    }
}

class Sale1 {
    // properties
    private double total;
    @SuppressWarnings("unused")
    private Payment payment;

    // constructors
    public void Sale(double total) {
        this.total = total;
    }

    // methods
    public void addPayment(Payment payment) {
        this.payment = payment;
        System.out.println("Payment of " + payment.getAmount() + " added to sale of " + this.total);
    }
}

public class Post1 {
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
