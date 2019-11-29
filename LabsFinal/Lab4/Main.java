package LabsFinal.Lab4;

import static LabsFinal.Lab4.Manager.*;


public class Main {
    public static void main (String[] args) {

            String[] array = readData("src\\Labs\\Lab4\\one_expression.txt");
            String[] array2 = readData( "src\\Labs\\Lab4\\three_expressions.txt" );
            printResults( array );
            printResults( array2 );

    }

}