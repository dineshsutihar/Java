package DSA_Prep.Basics2;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        System.out.println("String witout Reverse: "+ s);
    
        // Reversing the string:
        for (int i = 0; i<s.length()/2; i--) {
            int front = i;
            int back = s.length() - i - 1; // 5-1-0 = 4

            char frontChar = s.charAt(front);
            char backChar = s.charAt(back);

            // swap
            s.setCharAt(front, backChar);
            s.setCharAt(back, frontChar);
        }
    }
}
