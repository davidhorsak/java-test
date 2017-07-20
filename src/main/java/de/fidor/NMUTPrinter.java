package main.java.de.fidor;

public class NMUTPrinter {
    public String query;

    public NMUTPrinter(String word) {
        query = word;
    }

    public String it() {
        return "works!";
    }

    public void printResult() {
        System.out.println("Result");
    }
}
