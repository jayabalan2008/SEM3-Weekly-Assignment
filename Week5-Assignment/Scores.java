public class Scores {
    public static String findMinMaxSpread(int[] scores) {
        // Initialize min and max with the first element of the array
        int min = scores[0];
        int max = scores[0];
        
        // Traverse the array once starting from the second element
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        
        // Calculate the difference between max and min
        int spread = max - min;
        
        // Return the required formatted string
        return "Min: " + min + " | Max: " + max + " | Spread: " + spread;
    }

    public static void main(String[] args) {
        // Example test case from the problem statement
        int[] testScores = {45, 82, 79, 90, 33, 90, 61};
        
        // Call the method and print the output
        String result = findMinMaxSpread(testScores);
        System.out.println(result);
    }
}
