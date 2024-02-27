package LineCoverageTest;

import org.example.CorrectedPalindrome;
import org.example.Palindrome;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {



    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("radar"));
        assertFalse(Palindrome.isPalindrome("OpenAI"));
        assertFalse(Palindrome.isPalindrome("not palindrome"));


    }

    @Test
    public void testIsPalindromeCorrected() {
        assertTrue(CorrectedPalindrome.isPalindrome("radar"));
        assertFalse(CorrectedPalindrome.isPalindrome("OpenAI"));
        assertFalse(CorrectedPalindrome.isPalindrome("not palindrome"));


    }

    @Test
    public void testIsPalindrome_NullArgument() {
        // Test de cas où la chaîne est null
        assertThrows(NullPointerException.class, () -> {
            CorrectedPalindrome.isPalindrome(null);
        });
    }
    }


