package Labs.Lab4;

import java.io.File;
import java.util.Scanner;

import static Labs.Lab4.Manager.*;


public class Main {
    public static void main (String[] args) {

        ParanthesesStack mystack = new ParanthesesStack (100);
        String str;

            String[] array = readData("src\\Labs\\Lab4\\one_expression.txt");
            String[] array2 = readData( "src\\Labs\\Lab4\\three_expressions.txt" );
            printResults( array );
            printResults( array2 );


    }

}