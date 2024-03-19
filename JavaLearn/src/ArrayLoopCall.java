/* public class ArrayLoopCall {

    public static void main(String[] args) {

        // create an array
        int[] age = { 12, 4, 5 };

        // loop through the array
        // using for loop
        System.out.println("Using for-each Loop:");
        for (int a : age) {
            System.out.println(a);
        }
    }

} */

// Same Code using For loop
class ArrayLoopCall {
  public static void main(String[] args) {

    // create an array
    int[] age = { 12, 4, 5 };

    // loop through the array
    // using for loop
    System.out.println("Using for Loop:");
    for (int i = 0; i < age.length; i++) {
      System.out.println(age[i]);
    }
  }
}
