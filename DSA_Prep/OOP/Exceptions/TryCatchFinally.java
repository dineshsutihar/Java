package DSA_Prep.OOP.Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
          // code that generates exception
          @SuppressWarnings("unused")
          int divideByZero = 5 / 0;
        }
    
        catch (ArithmeticException e) {
          System.out.println("ArithmeticException => " + e.getMessage());
        }
        
        finally {
          System.out.println("This is the finally block");
        }
        
      }
}

/*
 
Note: It is a good practice to use the finally block. It is because it can include important cleanup codes like,

    - code that might be accidentally skipped by return, continue or break
    - closing a file or connection

 */