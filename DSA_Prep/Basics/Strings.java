import java.util.Scanner;

public class Strings {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Srings Declaration
        String name = "Dinesh Sutihar";
        String name2 = new String("Dinesh Sutihar");
        String sentence = "This is a sentence";

        // input form user
        Scanner sc = new Scanner(System.in);
        String name3 = sc.next(); // only takes the first word
        String name4 = sc.nextLine(); // takes the whole line
        System.out.println(name3);
        System.err.println(name4);

        // String Methods
        System.out.println(name.length()); // length of the string
        System.out.println(name.charAt(0)); // char at index 0
        System.out.println(name.substring(0,  6)); // substring from index 0 to 6
        System.out.println(name.substring(7)); // substring from index 7 to end
        System.out.println(name.contains("Dinesh")); // check if string contains "Dinesh"
        System.out.println(name.equals(name2)); // check if string are equal
        System.out.println(name.indexOf("Sutihar")); // index of "Sutihar"
        System.out.println(name.isEmpty()); // check if string is empty
        System.out.println(name.lastIndexOf("h")); // last index of "h"
        System.out.println(name.replace("Dinesh", "Dinesh Sutihar")); // replace "Dinesh" with "Dinesh Sutihar"
        System.out.println(name.startsWith("Dinesh")); // check if string starts with "Dinesh"
        System.out.println(name.endsWith("Sutihar")); // check if string ends with "Sutihar"
        System.out.println(name.toLowerCase()); // convert to lowercase
        System.out.println(name.toUpperCase()); // convert to uppercase
        System.out.println(name.trim()); // remove spaces from start and end
        sc.close();
        // Concatenation
        System.out.println(name.concat(name2));
        System.out.println(name + name2);

        // String to Array
        String[] arr = name.split(" ");
        for (String i : arr) {
            System.out.println(i);
        }

        // compare strings
        System.out.println(name.compareTo(name2)); // 0 if equal, -1 if not equal
        System.out.println(name.compareToIgnoreCase(name2)); // 0 if equal, -1 if not equal
        System.out.println(name.compareTo(name2) == 0 ? "Equal" : "Not Equal"); // ternary operator
    }
}
