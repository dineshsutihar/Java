package DSA_Prep.OOP.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// The try-with-resources statement is a try statement that declares one or more resources. A resource is an object that must be closed after the program is finished with it. The try-with-resources statement ensures that each resource is closed at the end of the statement. Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource.

// Note: The try-with-resources statement closes all the resources that implement the AutoCloseable interface.

/*
    import java.io.*;

    class Main {
      public static void main(String[] args) {
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
          while ((line = br.readLine()) != null) {
            System.out.println("Line =>"+line);
          }
        } catch (IOException e) {
          System.out.println("IOException in try block =>" + e.getMessage());
        }
      }
    }


*/

public class TryWithResources {
    public static void main(String[] args) {
    BufferedReader br = null;
    String line;

    try {
      System.out.println("Entering try block");
      br = new BufferedReader(new FileReader("test.txt"));
      while ((line = br.readLine()) != null) {
        System.out.println("Line =>"+line);
      }
    } catch (IOException e) {
      System.out.println("IOException in try block =>" + e.getMessage());
    } finally {
      System.out.println("Entering finally block");
      try {
        if (br != null) {
          br.close();
        }
      } catch (IOException e) {
        System.out.println("IOException in finally block =>"+e.getMessage());
      }

    }
  }
}
