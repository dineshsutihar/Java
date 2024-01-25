package DSA_Prep.Basics2;

import java.util.Scanner;

public class BitManupulationInJava {
public static void main(String[] args) {
    // Bitwise operators:
    // & | ^ ~ << >> >>>
    // & - AND
    // | - OR
    // ^ - XOR
    // ~ - NOT (1's Complement)
    // << - Left Shift
    // >> - Right Shift
    // >>> - Unsigned Right Shift

    // Operator Precedence:
    // Get Bit : First Bit Mask and then AND : we will use this to check if a bit is set or not at a particular position : for example we want to check if the bit at position 2 is set or not in the number 5
    int n = 5;
    int pos = 2;
    int bitMask = 1 << pos;

    if((bitMask & n) == 0) {
        System.out.println("Bit is 0");
    } else {
        System.out.println("Bit is 1");
    }
 
    // Set Bit : First Bit Mask and then OR : we will use this to set a bit at a particular position : for example we want to set the bit at position 1 in the number 5
    n = 5;
    pos = 1;
    bitMask = 1 << pos;

    int newNumber = bitMask | n;
    System.out.println(newNumber);

    // Clear Bit : First Bit Mask and then AND with 1's Complement : we will use this to clear a bit at a particular position : for example we want to clear the bit at position 1 in the number 5

    int n1 = 5;
    int pos1 = 2;
    int bitMask1 = 1 << pos1;
    int notBitMask = ~bitMask1;

    int newNumber1 = notBitMask & n1;
    System.out.println(newNumber1);


    // Update Bit : First Bit Mask and then AND with 1's Complement and then OR : we will use this to update a bit at a particular position : for example we want to update the bit at position 1 in the number 5 to 1

    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    // oper=1 -> set; oper=0 -> clear
    int number = 5;
    int position = 1;
    int bitmask = 1 << position;
    if (oper == 1) {
        // set
        int updatedNumber = bitmask | number;
        System.out.println(updatedNumber);
    } else {
        // clear
        int newBitmask = ~(bitmask);
        int updatedNumber = newBitmask & number;
        System.out.println(updatedNumber);
    }

}

}
