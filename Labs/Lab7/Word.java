package Labs.Lab7;

public class Word {
    String word;  // remembers the string content
    Word(String s)
    {
        this.word= s;
    }

    public int getVowels(){
        int vowels=0;   // nr of vowels
        for (int i=0;i<word.length ();i++){
            if (word.charAt( i ) == 'a' || word.charAt( i ) == 'e' || word.charAt( i ) == 'i' || word.charAt( i ) == 'o' || word.charAt( i ) == 'u' || word.charAt( i ) == 'y' ||
                    word.charAt( i ) == 'A' || word.charAt( i ) == 'E' || word.charAt( i ) == 'I' || word.charAt( i ) == 'O' || word.charAt( i ) == 'U' || word.charAt( i ) == 'Y'
            )
                vowels++;
        }
        return vowels;
    }
    public int getConsonants() {
        int consonants=0;   // nr of vowels
        for (int i=0;i<word.length ();i++){
            if ((word.charAt( i ) != 'a' && word.charAt( i ) != 'e' && word.charAt( i ) != 'i' && word.charAt( i ) != 'o' && word.charAt( i ) != 'u' && word.charAt( i ) != 'y' &&
                    word.charAt( i ) != 'A' && word.charAt( i ) != 'E' && word.charAt( i ) != 'I' && word.charAt( i ) != 'O' && word.charAt( i ) != 'U' && word.charAt( i ) != 'Y'
            )&&((word.charAt(i)>=65 && word.charAt (i)<=90)||(word.charAt (i)>=97 && word.charAt (i)<=122)))
             consonants++;

        }
        return consonants;
    }
}

