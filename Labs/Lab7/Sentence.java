package Labs.Lab7;

import java.util.Arrays;

public class Sentence {
    String sentence;  // the sentence
    int nrOfWords;   // nr of words in a sentence
    Sentence(String s)
    {
        this.sentence=s;
    }
    public Word[] split()     // returns the word array that contructs the sentence
    {
        String[] array = this.sentence.split ("\\W+"); // separators are every non alphanumeric characters
        System.out.println( Arrays.toString( array ) );
        Word[] wordArray=new Word[array.length];  // a word array that has the lenght as the string array
        nrOfWords=array.length;
        for (int i =0;i<array.length;i++)
        {
            wordArray[i]= new Word (array[i]);    // constructs a word using the string
        }
        return wordArray;   // returns the word array
    }
}
