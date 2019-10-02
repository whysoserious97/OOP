package Labs.Lab7;

public class Word {
    String word;  // remembers the string content
    int vowels;   // nr of vowels
    int consonants; // nr of consonants
    int letters;    // nr of leters(vowels+consonants)
    int frequency=0;  // how often a word is met in text
    Word(String s)
    {
        this.word= s;
        for (int i=0;i<s.length ();i++)
        {
            // looks if a character is a vowel
            if (s.charAt (i)=='a'||s.charAt (i)=='e'||s.charAt (i)=='i'||s.charAt (i)=='o'||s.charAt (i)=='u'||s.charAt (i)=='y'||
                    s.charAt (i)=='A'||s.charAt (i)=='E'||s.charAt (i)=='I'||s.charAt (i)=='O'||s.charAt (i)=='U'||s.charAt (i)=='Y'
            )
                vowels++;

            // looks if characters are alfa character
            else if ((s.charAt(i)>=65 && s.charAt (i)<=90)||(s.charAt (i)>=97 && s.charAt (i)<=122))
                consonants++;
        }
        letters=vowels+consonants;   // nr of letters



    }
}
