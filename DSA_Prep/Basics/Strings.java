import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Srings Declaration
        String name = "Dinesh Sutihar";
        String name2 = new String("Dinesh Sutihar");
        String sentence = "This is a sentence";

        // input form user
        Scanner sc = new Scanner(System.in);
        String name3 = sc.next(); // only takes the first word
        String name4 = sc.nextLine(); // takes the whole line
        System.err.println(name3);
        System.err.println(name4);

        // String Methods
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(0, 6));
        System.out.println(name.substring(7));
        System.out.println(name.contains("Dinesh"));
        System.out.println(name.equals(name2));
        System.out.println(name.indexOf("Sutihar"));
        System.out.println(name.isEmpty());
        System.out.println(name.lastIndexOf("h"));
        System.out.println(name.replace("Dinesh", "Dinesh Sutihar"));
        System.out.println(name.startsWith("Dinesh"));
        System.out.println(name.endsWith("Sutihar"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());

        // Concatenation
        System.out.println(name.concat(name2));
        System.out.println(name + name2);

        // String to Array
        String[] arr = name.split(" ");
        for (String i : arr) {
            System.out.println(i);
        }
        
    }
}
