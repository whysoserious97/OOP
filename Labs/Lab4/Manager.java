package Labs.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static Labs.Lab4.ParanthesesStack.isValid;

public class Manager{

    public static String[] readData(String path){
        String str;
        File f = new File (path);
        ArrayList<String> arrayList= new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (scanner != null) {
            while (scanner.hasNext()) {
                str = scanner.nextLine();
                arrayList.add( str );
            }
        }
        return arrayList.toArray( new String[ 0 ] );
    }

    public static void printResults(String[] input){
        for (int i = 0;i<input.length;i++)
        {
            if( isValid( input[i] ) ){
                System.out.println(input[i]);
                System.out.println( " Is valid!");
            }
            else {
                System.out.println(input[i]);
                System.out.println( " Is not valid" );
            }
        }
    }
}
