package main.java;

public class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        String[] words = phrase.split(" ");
        int nrOfWords = words.length;

        StringBuilder jadenPhrase = new StringBuilder();

        int i = 0;
        for (String word : words ) {
            StringBuilder wordBuilder = new StringBuilder(word);
            char firstChar = word.charAt(0);
            wordBuilder.setCharAt(0, Character.toUpperCase(firstChar));
            if (++i < nrOfWords) {
                wordBuilder.append(" ");
            }
            jadenPhrase.append(wordBuilder);
        }

        return jadenPhrase.toString();
    }

    public static void main(String[] args) {
        JadenCase jc = new JadenCase();

        String result = jc.toJadenCase("dit is een test");
        System.out.println(result);
    }

}
