package Labs.Lab4;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Mystack mystack = new Mystack (100);   // creates a stack with size 100
        String str; // declaring the expresion string
        try {     // try...catch block for reading files

            File f = new File ("src\\Labs\\Lab4\\one_expression.txt");    // creating the variable with the first string
            Scanner scanner = new Scanner (f);   // reading from the file and putting everything in the scanner
            str=scanner.nextLine ();      // reads the line from scanner
            mystack.valid (str); // checks if the string has enclosed all parentheses

            System.out.println ();  // separates files expressions with a blank line

            f = new File ("src\\Labs\\Lab4\\three_expressions.txt");    // reassign the source of the file
            scanner = new Scanner (f);

            for (int i=0;i<3;i++) //checks all 3 expresion from file
            {
                str=scanner.nextLine ();  // string to be checked
                mystack.valid (str);      // executes the valid method that will print the result
            }
        }catch (Exception e)
        {
           e.printStackTrace (); // if there is no file the exception will occur and the StackTrace will be printed
        }

    }

}