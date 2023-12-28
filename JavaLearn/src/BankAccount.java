package JavaLearning;

class Bank {
    private long accontno = 123456;
    private int balance = 1234;

    void setx(int interest) {
    }

    void getx() {

        System.out.println("Account no is :" + accontno);
        System.out.println("Inteerst is: " + balance);
    }

}

public class BankAccount {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setx(10);
        b.getx();
    }
}