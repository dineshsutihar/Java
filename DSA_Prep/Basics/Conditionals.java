public class Conditionals {
    // if-else
    // if-else-if
    // switch-case
    public static void main(String args[]) {
        // if-else
        int a = 5;
        int b = 10;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        // if-else-if
        int c = 15;
        if (a > b && a > c) {
            System.out.println("a is greater than b and c");
        } else if (b > a && b > c) {
            System.out.println("b is greater than a and c");
        } else {
            System.out.println("c is greater than a and b");
        }

        // switch-case
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // break is used to stop the execution of the switch-case
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednessday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }

        // Ternary Operator
        // Syntax: (condition) ? (true) : (false)
        int x = 5;
        int y = 10;
        int z = (x > y) ? x : y;
        System.out.println(z);

        // Nested Ternary Operator
        int p = 5;
        int q = 10;
        int r = 15;
        int s = (p > q) ? ((p > r) ? p : r) : ((q > r) ? q : r);
        System.out.println(s);

    }
}
