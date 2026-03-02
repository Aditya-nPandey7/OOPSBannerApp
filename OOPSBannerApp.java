/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods[cite: 74, 76].
 */
public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O' [cite: 114]
    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " ** **",
            "** **",
            "** **",
            "** **",
            " ** **",
            "  *** "
        };
    }

    // Method to generate the pattern for the letter 'P' [cite: 115]
    public static String[] getPPattern() {
        return new String[] {
            " ****** ",
            " ** **",
            " ** **",
            " ****** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    // Method to generate the pattern for the letter 'S' [cite: 116]
    public static String[] getSPattern() {
        return new String[] {
            "  ***** ",
            " ** **",
            " ** ",
            "  **** ",
            "      **",
            " ** **",
            "  ***** "
        };
    }

    // Main method to run the banner display [cite: 117]
    public static void main(String[] args) {
        // Declare String Arrays to hold patterns for each letter [cite: 119]
        String[] oPattern = getOPattern(); // [cite: 120]
        String[] pPattern = getPPattern(); // [cite: 121]
        String[] sPattern = getSPattern(); // [cite: 122]

        // Use the loop to Assemble each line of the banner [cite: 123]
        for (int i = 0; i < oPattern.length; i++) { // [cite: 126]
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]); // [cite: 65]
        }
    }
}