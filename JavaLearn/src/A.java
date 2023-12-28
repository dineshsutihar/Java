
class A extends B {
    public void f1(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String ar[]) {
        A a = new A();
        a.f1(5, 5);
        B b = new B();
        b.f1(2, 3);
    }


class B {
    public void f1(int x, int y) {
        System.out.println(x + y);
    }
}
