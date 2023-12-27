package HashTable;

public class Main {
    public static void main(String[] args) {
        System.out.println("HashTable program!");

        WordFrequency frequency = new WordFrequency();
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().replace(".", "").replace("?", "").split("\\s+");

        for(String word : words){
            frequency.add(word);
        }

        frequency.displayFrequencies();
    }
}
