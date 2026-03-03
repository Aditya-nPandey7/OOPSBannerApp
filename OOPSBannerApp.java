import java.util.HashMap;

/**
 * OOPSBannerApp UC8
 * Utilizes the Collections Framework (HashMap) to manage character patterns efficiently. [cite: 63, 65]
 */
public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns. [cite: 85, 89]
     * Key: Character, Value: String array (pattern lines). [cite: 15]
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>(); 

        charMap.put('O', new String[]{
            "  *** ", " * * ", "* *", "* *", "* *", " * * ", "  *** "}); 
        charMap.put('P', new String[]{
            "***** ", "* * ", "* * ", "***** ", "* ", "* ", "* "});
        charMap.put('S', new String[]{
            " **** ", "* * ", "* ", " **** ", "     * ", "* * ", " **** "});
        
        return charMap;
    }

    /**
     * Displays a banner message using the provided character map. [cite: 97, 103]
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Assuming all patterns have the same height [cite: 104, 105]
        int patternHeight = charMap.get('O').length;

        // Outer loop for each line (row) of the banner [cite: 21, 106]
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            // Inner loop for each character in the message [cite: 21, 48]
            for (char ch : message.toUpperCase().toCharArray()) {
                String[] pattern = charMap.get(ch);
                if (pattern != null) {
                    sb.append(pattern[line]).append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}