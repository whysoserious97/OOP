package Labs.Lab4;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Mystack mystack = new Mystack (100);
        String str; // declaring the expresion string
        try {

            File f = new File ("src\\Labs\\Lab4\\one_expression.txt");
            Scanner scanner = new Scanner (f);
            str=scanner.nextLine ();
            mystack.valid (str); // checks if the string has enclosed all parentheses

            System.out.println ();  // separates files expressions with a blank line

            f = new File ("src\\Labs\\Lab4\\three_expressions.txt");
            scanner = new Scanner (f);

            for (int i=0;i<3;i++) //checks all 3 expresion from file
            {
                str=scanner.nextLine ();
                mystack.valid (str);
            }
        }catch (Exception e)
        {
           e.printStackTrace ();
        }

    }

}