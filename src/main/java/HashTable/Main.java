package HashTable;

public class Main {
    public static void main(String[] args) {
        System.out.println("HashTable program!");

        WordFrequency frequency = new WordFrequency();
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split("\\W+"); // \\W+ means split by non-word characters

        for(String word : words){
            frequency.add(word);
        }

        frequency.displayFrequencies();
        System.out.println();

        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words1 = paragraph.toLowerCase().split("\\W+"); // \\W+ means split by non-word characters

        for(String word : words1){
            frequency.add(word);
        }

        // Remove the word 'avoidable'
        frequency.remove("avoidable");

        frequency.displayFrequencies();
    }
}
