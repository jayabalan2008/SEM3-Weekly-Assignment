public class TypingSpeedTest {

    public static void checkTypingAccuracy(String original, String typed) {
        int totalCharacters = original.length();
        int matchedCharacters = 0;
        int firstMismatchPosition = -1;
        
        char origChar = ' ';
        char typeChar = ' ';

        for (int i = 0; i < totalCharacters; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedCharacters++;
            } else {
                if (firstMismatchPosition == -1) {
                    firstMismatchPosition = i + 1; 
                    origChar = original.charAt(i);
                    typeChar = typed.charAt(i);
                }
            }
        }

        double accuracyPercentage = ((double) matchedCharacters / totalCharacters) * 100;

        System.out.print("Matched: " + matchedCharacters + "/" + totalCharacters + " | ");
        System.out.printf("Accuracy: %.2f%% | ", accuracyPercentage);

        if (firstMismatchPosition == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.println("First Mismatch at position " + firstMismatchPosition + 
                               " ('" + origChar + "' vs '" + typeChar + "')");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        checkTypingAccuracy("hello world", "hello worlt");

        System.out.println("\n--- Test Case 2 ---");
        checkTypingAccuracy("coding", "coding");
    }
}
