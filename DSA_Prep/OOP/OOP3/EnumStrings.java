package DSA_Prep.OOP.OOP3;

// as we know the name() and toString() method are same but the main difference is that we can override the toSting() but we cannot override the name() method..

enum Size{
    SMALL {

        // overriding toSting() 
        public String toString(){
            return "The size is small.";
        }
    },
    
    MEDIUM {

        // overriding toSting() for MEDIUM
        public String toString(){
            return "The size is medium.";
        }
    };
}


public class EnumStrings {
    
    public static void main(String[] args) {
        System.out.println(Size.MEDIUM.toString());
    }
}

// Note: We cannot override the name() method. It is because the name() method is final.