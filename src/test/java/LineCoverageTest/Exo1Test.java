package LineCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exo1Test {



    @Test
    public void testIsPalindrome() {
        // Test de cas où la chaîne est un palindrome
        assertTrue(Palindrome.isPalindrome("radar"));
    }

}
