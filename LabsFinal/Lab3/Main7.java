package LabsFinal.Lab3;


import java.util.Arrays;

public class Main7 {
    public static void main (String[] args) {
        String str = "India          is a country in South Asia. Comprising the bulk of the Indian subcontinent, India owes its geography, climate and biodiversity to ancient plate tectonics which pushed the Indian Plate north from deep in the Southern Hemisphere." +
                " Modern humans arrived on the subcontinent from Africa no later than 55,000 years ago. Settled life emerged in the western margins of the Indus River basin 9,000 years ago. India is home to a large mix of languages, religions, and cultures. " +
                "It is the world's most populous democracy, with 1.3 billion people, and a secular federal republic governed in a parliamentary system. It is the world's third-largest economy in purchasing power parity, and a fast-growing major economy." +
                " After 190 years in the British Empire, India gained independence in 1947 through a campaign of nonviolent resistance whose enduring symbol is Mahatma Gandhi (born 2 October 1869).";

        Text text = new Text (str);

        System.out.println("The number of sentences = "+text.getNrOfSentences());
        System.out.println("The number of consonants = "+text.getNrOfConsonants());
        System.out.println("The number of letters = "+text.getNrOfLetters());
        System.out.println("The number of vowels = "+text.getNrOfVowels());
        System.out.println("The number of words = "+text.getNrOfWords());
        System.out.println("Top 5 words by their frequency = "+ Arrays.toString( text.getTop5() ) );
        System.out.println("the longest word in text: "+text.getLongest());


    }

}
