package DSA_Prep.Basics2;

class StringBuilderInJava {
// StringBuilder is mutable and it is different from String in the sense that it is mutable. and it is faster than String. because it does not create a new object every time we append something to it. it just appends to the same object.
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder( "Hello" ); // we can pass a string to the constructor of StringBuilder

        System.out.println(sb); // Hello

        // Char at index 0
        System.out.println(sb.charAt(0)); // H

        // set char at index
        sb.setCharAt(0, 'P'); // Pello
        System.out.println(sb);

        // insert at index and the string to be inserted and rest will be shifted to the right
        sb.insert(0, "Dinesh "); // Dinesh Pello
        System.out.println(sb); // Dinesh Pello

        // delete the extra 'p'
        sb.delete(7, 8); //  endindex is exclusive
        System.out.println(sb); // Dinesh ello

        // append to the end of the string
        sb.append(" World"); // Dinesh ello World
        System.out.println(sb); // Dinesh ello World

        // length of any sting
        System.out.println(sb.length()); // 15

        
    }
    
}