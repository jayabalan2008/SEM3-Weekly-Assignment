public class CricketStatsApp {

    // 1. Helper method: Only calculates the average for ONE match
    private static double rowAverage(int[] row) {
        int totalRuns = 0;
        
        // Add up all the runs in this specific match
        for (int runs : row) {
            totalRuns = totalRuns + runs;
        }
        
        // Use (double) so Java doesn't cut off decimal places during division
        double average = (double) totalRuns / row.length;
        return average;
    }

    // 2. Classification method: Loops through all matches and builds the final text
    public static String classifyMatches(int[][] runsPerOver, int threshold) {
        String result = "";
        
        // Loop through every match (every row in our grid)
        for (int i = 0; i < runsPerOver.length; i++) {
            
            // Get the current match's array
            int[] currentMatch = runsPerOver[i];
            
            // Call our helper method to get the average
            double matchAverage = rowAverage(currentMatch);
            
            // Check if it's a "Power Surge" or "Normal"
            String status = "";
            if (matchAverage >= threshold) {
                status = "Power Surge";
            } else {
                status = "Normal";
            }
            
            // Build the string: "Match 0: Normal"
            result = result + "Match " + i + ": " + status;
            
            // Add the " | " separator ONLY if it's not the last match
            if (i < runsPerOver.length - 1) {
                result = result + " | ";
            }
        }
        
        return result;
    }

    // 3. The starting point of the program to test our code
    public static void main(String[] args) {
        // Sample data from the problem statement
        int[][] sampleInput = {
            {4, 6, 8},      // Match 0 (Average is 6.0)
            {10, 12, 14},   // Match 1 (Average is 12.0)
            {2, 3, 1}       // Match 2 (Average is 2.0)
        };
        int threshold = 8;

        // Run the method and print the final output
        String finalOutput = classifyMatches(sampleInput, threshold);
        System.out.println(finalOutput);
    }
}
