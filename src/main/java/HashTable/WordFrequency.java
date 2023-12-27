package HashTable;

import java.util.LinkedList;

public class WordFrequency {
    private final int numBuckets = 10;
    LinkedList<MyMapNode<String, Integer>>[] hashTable;

    public WordFrequency() {
        hashTable = new LinkedList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(String key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % numBuckets); // to make sure index is within bounds
    }

    public void add(String word) {
        int index = getBucketIndex(word);
        LinkedList<MyMapNode<String, Integer>> chain = hashTable[index];

        for(MyMapNode<String, Integer> node : chain){
            if(node.key.equals(word)){
                node.value++;
                return;
            }
        }

        chain.add(new MyMapNode<>(word, 1));
    }

    public void displayFrequencies() {
        for(LinkedList<MyMapNode<String, Integer>> chain : hashTable){
            for(MyMapNode<String, Integer> node : chain){
                System.out.println(node.key + ": " + node.value);
            }
        }
    }
}