package LabsFinal.Lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Text{

    String str;

  public  Text( String s ) {
        str = s;
    }

    private Sentence[] split() {
        String[] array = this.str.split( "\\.+\\s+|!\\s+|\\?\\s+|;\\s+" ); // splits are characters that usually ends a sentence((.),(!),(?),(;)) and is followed by a space
        Sentence[] senarray = new Sentence[ array.length ];
        for ( int i = 0 ; i < array.length ; i++ ){
            senarray[ i ] = new Sentence( array[ i ] ); // a new element is created with the string from array
        }
        return senarray;
    }
    public  String[] getTop5() {
            String[] top= new String[5];
            HashMap<String, Integer> hashMap ;   // used to count words
            hashMap=getHashMap();
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
    public int getNrOfSentences(){
        return split().length;
    }
    public int getNrOfWords() {
        int nrOfWords=0;
       Sentence[] textArray= split();       //sentences in text
       for ( int i = 0 ; i < textArray.length ; i++ ){  // is working with every sentence
           nrOfWords += textArray[ i ].split().length;   // sets the current sentence as words

       }
        return nrOfWords;
    }
    public int getNrOfVowels(){
      int nrOfVowels=0;
        Sentence[] textArray= split();       //sentences in text
        Word[] splitedScentence;
        for ( int i = 0 ; i < textArray.length ; i++ ){  // is working with every sentence
            splitedScentence = textArray[ i ].split();   // sets the current sentence as words
            for ( int j = 0 ; j < splitedScentence.length ; j++ ){   // each sentence has words
                nrOfVowels += splitedScentence[ j ].getVowels();
            }

        }
      return nrOfVowels;
    }
    public int getNrOfConsonants(){
        int nrOfConsonants=0;
        Sentence[] textArray= split();       //sentences in text
         Word[] splitedScentence;
        for ( int i = 0 ; i < textArray.length ; i++ ){  // is working with every sentence
            splitedScentence = textArray[ i ].split();   // sets the current sentence as words
            for ( int j = 0 ; j < splitedScentence.length ; j++ ){   // each sentence has words
                   nrOfConsonants += splitedScentence[ j ].getConsonants();
            }
        }
        return nrOfConsonants;
    }
    public int getNrOfLetters(){
      return getNrOfConsonants()+getNrOfVowels();
    }
    public String getLongest(){
      int maxString=0;
      String longest="";
        List<Word> words;
        words=getWordsarray();
        for ( int i = 0 ; i < words.size() ; i++ ){
            if (maxString<words.get( i ).word.length())
            {
                longest=words.get( i ).word;    // sets the content of the string
                maxString=words.get( i ).word.length(); // sets the current max string
            }
        }
      return longest;
    }
    public HashMap<String, Integer> getHashMap(){
        List<Word> words;
        words=getWordsarray();
        HashMap<String, Integer> hashMap=new HashMap<>();
        for ( int i = 0 ; i < words.size() ; i++ ){
            if (hashMap.containsKey( words.get( i ).word.toLowerCase() )) {  // we check in lower case  ,   because "This" and "this" are the same word
                hashMap.put( words.get( i ).word.toLowerCase(), hashMap.get( words.get( i ).word.toLowerCase() ) + 1 );    // if the hashmap contains the string it will override that string with itself but with a value greater with 1
            } else {
                hashMap.put( words.get( i ).word.toLowerCase(), 1 );   // sets the first value
            }
        }
        return hashMap;
    }
    public List<Word> getWordsarray(){
      List<Word> words = new ArrayList<>(); // All words in the text
         Word[] splitedScentence;
        Sentence[] textArray= split();
        for ( int i = 0 ; i < textArray.length ; i++ ){
            splitedScentence = textArray[ i ].split();
            for ( int j = 0 ; j < splitedScentence.length ; j++ ){
                words.add( splitedScentence[ j ] );
            }
        }
        return words;
    }
}

