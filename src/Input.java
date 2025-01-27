public class Input {
    public Input() {
        int year = 2022;
        System.out.println(getInputFromConsole(year));
    }
    public static String getInputFromConsole(int year) {
        String name = System.console().readLine("Name??");
        System.out.println("Hi " + name);
        return "";
    }
    public static String getInputFromScanner(int year) {
        return "";
    }
}

