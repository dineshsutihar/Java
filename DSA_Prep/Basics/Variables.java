import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Hello World! \n");
        System.out.printf("Hello World! %d", 5);

        String s = "Dinesh Kumar";
        System.out.println(s);

        int a = 5;
        System.out.println(a); // 5

        float f = 5.5f;
        System.out.println(f); // 5.5

        double d = 5.5;
        System.out.println(d); // 5.5

        char c = 'a';
        System.out.println(c); // a

        boolean b = true;
        System.out.println(b); // true

        int[] arr = { 1, 2, 3, 4, 5 };  // Array 
        System.out.println(arr); // [I@15db9742 (Hashcode) 

        Scanner   sc = new Scanner(System.in); // Scanner
        int n = sc.nextInt();
        System.out.println(n); // 5
        
        String str = sc.next(); // it will take only one word
        System.out.println(str); // Dinesh

        String str1 = sc.nextLine(); // it will take whole line
        System.out.println(str1); // Dinesh Kumar

        // nextInt() - int
        // nextFloat() - float
        // nextDouble() - double
        // next() - String
        // nextLine() - String (whole line)
        

        

        // two types of data types
        // 1. Primitive data types
        //8 => byte - byte , short, int, long, float, double, char - 2bytes, boolean  - 1byte


        // 2. Non-Primitive data types
        // String, Array, Class, Interface, etc.

        // links for more info: https://docs.google.com/document/d/1upllrlSyv1pe86hBbNPUFT1nrmWsr6QPM4joL6Br1gU/edit

        sc.close();
    }
}
