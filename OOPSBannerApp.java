
public class OOPSBannerApp {

    // This is the new method that handles the printing logic
    public static void printBanner() {
        // ROW 1
        System.out.println("  *** " + "  *** " + " ****** " + "  ***** ");
        
        // ROW 2
        System.out.println(" * * " + " * * " + " * * " + " * ");
        
        // ROW 3
        System.out.println(" * * " + " * * " + " * * " + " * ");
        
        // ROW 4
        System.out.println(" * * " + " * * " + " ****** " + "  ***** ");
        
        // ROW 5
        System.out.println(" * * " + " * * " + " * " + "       * ");
        
        // ROW 6
        System.out.println(" * * " + " * * " + " * " + "       * ");
        
        // ROW 7
        System.out.println("  *** " + "  *** " + " * " + "  ***** ");
    }

    // Main method now just calls our custom method
    public static void main(String[] args) {
        printBanner();
    }
}