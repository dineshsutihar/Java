
class Testa {
    int a;// default access.
    public int b;// public acess
    private int c;// private access
    // method to access c

    void setc(int i) {// setc's value
        c = i;

    }

    int getc() {// getc's value
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Testa ob = new Testa();
        // These are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;
        // This is not OK and will cause an error
        // ob.c=100; //Error!
        // You must access c through its methods
        ob.setc(100);// OK
        System.out.println("a,b, and c: " + ob.a + " " + ob.b + " " + ob.getc());

    }
}
