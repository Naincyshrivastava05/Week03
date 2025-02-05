package linearsearch;

public class SentenceSearch {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java is a powerful programming language.",
                "Linear search is simple but inefficient for large datasets.",
                "Machine learning is shaping the future."
        };

        String word = "Java";
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence found: " + result);
    }
}
