package de.fidor;

import main.java.de.fidor.NMUTPrinter;

class NMUTTool {
    public static void main(String[] args) {
        if (args.length == 0)
        {
            System.out.println("There were no commandline arguments passed!");
        }
        else
        {
            for(int index = 0; index < args.length; index++) {
                NMUTPrinter printer = new NMUTPrinter(args[index]);
                printer.printResult();
            }
        }
    }
}
