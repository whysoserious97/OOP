package Labs.Lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Text{

    String s;   // original string
    int nrOfSentences;      // nr of sentences that are in original string
    public Sentence[] textArray;       //sentences in text
    private List<Word> words = new ArrayList<>(); // All words in the text
    int nrOfWords = 0;                             // nr of words
    int nrOfLetters = 0;                // nr of letters
    String[] top5;                // top 5 words
    int nrOfVowels = 0;
    int nrOfconsonants = 0;
    public Word[] splitedScentence;
    HashMap<String, Integer> hashMap = new HashMap<>();   // used to count words
    String longest; // the longest string in text
    int maxString=0; // length of the longest string


  public  Text( String s ) {
        this.s = s;       // the full text is here
        textArray = split(); // original text to array of sentences
        nrOfSentences = textArray.length;

        for ( int i = 0 ; i < textArray.length ; i++ ){  // is working with every sentence
            splitedScentence = textArray[ i ].split();   // sets the current sentence as words
            for ( int j = 0 ; j < splitedScentence.length ; j++ ){   // each sentence has words
                words.add( splitedScentence[ j ] );      // using an array to store words
                nrOfconsonants += splitedScentence[ j ].consonants;
                nrOfVowels += splitedScentence[ j ].vowels;
                nrOfLetters += splitedScentence[ j ].letters;
            }
            nrOfWords += splitedScentence.length;
        }
        // after all this we want to count all distinct words in the  array and select the longest word
        for ( int i = 0 ; i < words.size() ; i++ ){

            if (maxString<words.get( i ).word.length())
            {
                longest=words.get( i ).word;    // sets the content of the string
                maxString=words.get( i ).word.length(); // sets the current max string
            }

            if (hashMap.containsKey( words.get( i ).word.toLowerCase() )) {  // we check in lower case  ,   because "This" and "this" are the same word
                hashMap.put( words.get( i ).word.toLowerCase(), hashMap.get( words.get( i ).word.toLowerCase() ) + 1 );    // if the hashmap contains the string it will override that string with itself but with a value greater with 1
            } else {
                hashMap.put( words.get( i ).word.toLowerCase(), 1 );   // sets the first value
            }
        }
    }

    private Sentence[] split() {
        String[] array = this.s.split( "\\.+\\s+|!\\s+|\\?\\s+|;\\s+" ); // splits are characters that usually ends a sentence((.),(!),(?),(;)) and is followed by a space
        Sentence[] senarray = new Sentence[ array.length ];
        for ( int i = 0 ; i < array.length ; i++ ){
            senarray[ i ] = new Sentence( array[ i ] ); // a new element is created with the string from array
        }
        return senarray;
    }
      public  String[] getTop5()
        {
            String[] top= new String[5];
            // now we want to create an array that stores the String and another that stores the nr of words.
            String[] strArr= new String[hashMap.size()];
            int[] intaArr= new int[hashMap.size()];
            Iterator iterator= hashMap.keySet().iterator();
            for (int i=0; iterator.hasNext();i++)
            {
                strArr[i]=(String) iterator.next();
                intaArr[i]=hashMap.get( strArr[i] );

            }
            bubbleSort(strArr,intaArr);
            if(strArr.length>=5) {
                for ( int i = 0 ; i < 5 ; i++ ){
                    top[ i ] = strArr[ strArr.length - i-1 ];
                }
            } else {
                for ( int i = 0 ; i < strArr.length ; i++ ){
                    top[ i ] = strArr[ strArr.length - i-1 ];     // last element is nr 1 , 2nd, is the second most used
                }
            }
            return  top;
        }
        private void bubbleSort(String[] strArr, int[] intArr){   // bubble sort for 2 arrays costumized based on int array values
        int tempint;
        String tempstr;
            for (int i=0;i<strArr.length;i++)     // nr of loops
            {
                for ( int j=0;j<strArr.length-i-1;j++ )   // the length of a loop
                {
                    if (intArr[j]>intArr[j+1])     // swapping condition
                    {
                        tempint=intArr[j];       // swaps integers
                        intArr[j]=intArr[j+1];
                        intArr[j+1]=tempint;

                        tempstr=strArr[j];       //swaps the strings
                        strArr[j]=strArr[j+1];
                        strArr[j+1]=tempstr;
                    }
                }
            }
        }

}
