import java.util.Scanner;

/**
 * OOPSBannerApp UC7 Store Character Pattern in a Class
 * This use case implements a CharacterPatternMap class to encapsulate character-to-pattern mappings.
 */
public class OOPSBannerApp {

    /**
     * Inner class for storing character-to-pattern mappings.
     * Encapsulates a single character and its corresponding ASCII art pattern. [cite: 286, 287]
     */
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        /**
         * Constructs a CharacterPatternMap with a character and its pattern. [cite: 297, 300]
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Initializes CharacterPatternMap array for 'O', 'P', 'S' and space. [cite: 320, 322]
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];
        
        charMaps[0] = new CharacterPatternMap('O', new String[]{
            "  *** ", " * * ", "* *", "* *", "* *", " * * ", "  *** "});
        charMaps[1] = new CharacterPatternMap('P', new String[]{
            "***** ", "* * ", "* * ", "***** ", "* ", "* ", "* "});
        charMaps[2] = new CharacterPatternMap('S', new String[]{
            " **** ", "* * ", "* ", " **** ", "     * ", "* * ", " **** "});
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
            "       ", "       ", "       ", "       ", "       ", "       ", "       "});
            
        return charMaps;
    }

    /**
     * Searches through the maps to find a matching character. [cite: 331]
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (Character.toUpperCase(ch) == map.getCharacter()) {
                return map.getPattern();
            }
        }
        return charMaps[3].getPattern(); // Return space if not found [cite: 332]
    }

    /**
     * Renders the message horizontally by combining pattern lines. [cite: 343, 344]
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int patternHeight = 7;
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                sb.append(pattern[line]).append("  ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
    // 1. Create the CharacterPatternMap array first [cite: 376]
    CharacterPatternMap[] charMaps = createCharacterPatternMaps();
    // 2. Declare and initialize the message 
    String message = "OOPS"; 
    // 3. NOW call the print method using the initialized variables [cite: 379, 380]
    printMessage(message, charMaps);
	}
}
