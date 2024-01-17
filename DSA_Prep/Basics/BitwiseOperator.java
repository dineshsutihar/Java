/**
 * BitwiseOperator
 */
public class BitwiseOperator {

    public static void main(String[] args){
        // ~ complement Operator
        int a = 0b01010101; // 85
        System.out.println(~a); // -86 or 0b10101010

        //<< Left Shift Operator
        int b = 0b01010101; // 85
        System.out.println(b << 1); // 170 or 0b10101010

        //>> Right Shift Operator
        int c = 0b01010101; // 85
        System.out.println(c >> 1); // 42 or 0b00101010


        //>>> Unsigned Right Shift Operator
        int d = 0b01010101; // 85
        System.out.println(d >>> 1); // 42 or 0b00101010

        //& Bitwise AND Operator
        int e = 0b01010101; // 85
        int f = 0b10101010; // 170
        System.out.println(e & f); // 0 or 0b00000000


        //| Bitwise OR Operator
        int g = 0b01010101; // 85
        int h = 0b10101010; // 170
        System.out.println(g | h); // 255 or 0b11111111

        //^ Bitwise XOR Operator
        int i = 0b01010101; // 85
        int j = 0b10101010; // 170
        System.out.println(i ^ j); // 255 or 0b11111111
        
    }
}