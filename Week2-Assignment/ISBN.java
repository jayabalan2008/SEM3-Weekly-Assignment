public class ISBN {

    public static String normalizeCode(String raw) {
        if (raw == null) {
            return "";
        }
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }
        String firstThree = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        
        return firstThree + rest;
    }
    public static String validateAndFormat(String code) {
    
        if (code == null || code.length() != 13) {
            return "wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "non-letter publisher code";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "non-digit body";
            }
        }

        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(pubCode).append("] ")
          .append("YEAR: ").append(year).append(" | ")
          .append("CATALOG: ").append(catalog);

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = " pen2026004251 ";
        
        System.out.println("Input : \"" + input + "\"");
        String normalized = normalizeCode(input);
        String output = validateAndFormat(normalized);
        System.out.println("Output: " + output);
    }
}
