
import java.util.Scanner;

import javax.tools.DiagnosticCollector;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scan = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        TextUI ui = new TextUI(scan, dictionary);
        ui.start();
    }
}
