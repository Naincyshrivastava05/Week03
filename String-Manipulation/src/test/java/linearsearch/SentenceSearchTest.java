package linearsearch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SentenceSearchTest {

    @Test
    void testFindSentenceWithWord() {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java is a powerful programming language.",
                "Linear search is simple but inefficient for large datasets.",
                "Machine learning is shaping the future."
        };

        assertEquals("Java is a powerful programming language.", SentenceSearch.findSentenceWithWord(sentences, "Java"));
        assertEquals("The quick brown fox jumps over the lazy dog.", SentenceSearch.findSentenceWithWord(sentences, "fox"));
        assertEquals("Linear search is simple but inefficient for large datasets.", SentenceSearch.findSentenceWithWord(sentences, "search"));
        assertEquals("Not Found", SentenceSearch.findSentenceWithWord(sentences, "Python"));
        assertEquals("Machine learning is shaping the future.", SentenceSearch.findSentenceWithWord(sentences, "future"));
    }
}
