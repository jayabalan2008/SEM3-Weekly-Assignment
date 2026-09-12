import java.util.Arrays;

public class FantasySports {

    public static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        // Multiply the captain's score by 2 (2x points)
        playerScores[captainIndex] *= 2.0;
        
        // Multiply the vice-captain's score by 1.5 (1.5x points)
        playerScores[viceCaptainIndex] *= 1.5;
    }

    public static void main(String[] args) {
        // Test example from the problem statement
        double[] scores = {40, 55, 30, 62};
        
        System.out.println("Original scores: " + Arrays.toString(scores));
        
        // Index 1 (55) is captain, Index 3 (62) is vice-captain
        applyMultipliers(scores, 1, 3);
        
        System.out.println("Modified scores: " + Arrays.toString(scores));
    }
}
