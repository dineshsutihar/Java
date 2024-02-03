package DSA_Prep.OOP.OOP3;

 // An enum (short for enumeration) is a type that has a fixed set of constant values. We use the enum keyword to declare enums. 

 enum Size{
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize(){

        // this will refer to the object SMALL
        switch (this) {
            case SMALL:
                return "small size";

            case MEDIUM:
                return "medium";
        
            case LARGE:
                return "large";
        
            case EXTRALARGE:
                return "extra large";
        
            default:
                return null;
        }
    }
 }

public class JavaEnums {
   
    public static void main(String[] args) {
        System.out.println("The pizza is :" + Size.SMALL.getSize());
    }
    
}

// we have multiple methods of java Enum class

// 1. Java Enum oridnal(SMALL) => return the position of and enum constant.
// 2.  Size.SMALL.compareTo(Size.MEDIUM) =>  compares the enum constants based on their ordinal value. 
// 3. SMALL.toString() =>  returns the string representation of the enum constants.
// 4. name(SMALL) => eturns the defined name of an enum constant in string form. The returned value from the name() method is final.
// 5. Size.valueOf("SMALL") => method takes a string and returns an enum constant having the same string name.
// 6. values() => returns an array of enum type containing all the enum constants::::   Size[] enumArray = Size.value();
