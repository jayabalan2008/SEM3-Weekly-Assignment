public class LineupChecker {

    public static String findDuplicatePick(String[] playerNames) {
        // Outer loop selects a player name to check
        for (int i = 0; i < playerNames.length; i++) {
            // Inner loop only compares against names that come AFTER the current name
            for (int j = i + 1; j < playerNames.length; j++) {
                // Case-sensitive comparison using plain string equality
                if (playerNames[i].equals(playerNames[j])) {
                    // Early-exit scanning: returns immediately upon finding the first duplicate
                    return "Duplicate Found: " + playerNames[i];
                }
            }
        }
        // If loops complete without finding any match
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        // Test Case 1: Contains duplicate
        String[] lineup1 = {"Kohli", "Bumrah", "Kohli", "Rohit"};
        System.out.println("Input:  {\"Kohli\", \"Bumrah\", \"Kohli\", \"Rohit\"}");
        System.out.println("Output: \"" + findDuplicatePick(lineup1) + "\"\n");

        // Test Case 2: No duplicates
        String[] lineup2 = {"Kohli", "Bumrah", "Rohit"};
        System.out.println("Input:  {\"Kohli\", \"Bumrah\", \"Rohit\"}");
        System.out.println("Output: \"" + findDuplicatePick(lineup2) + "\"");
    }
}
