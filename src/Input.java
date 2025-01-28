import java.util.Scanner;

public class Input {
    public Input() {
        int year = 2022;
        System.out.println(getInputFromConsole(year));
    }
    public static String getInputFromConsole(int year) {
        String name = System.console().readLine("Name??");
        System.out.println("Hi " + name);
        return "";
    } //input from console works only with manual compilation and run, disabled in IDE
    public static String getInputFromScanner(int year) {
        Scanner in = new Scanner(System.in); //System.out dumps text to console, therefore .in is opposite
        return "";
    }

}

