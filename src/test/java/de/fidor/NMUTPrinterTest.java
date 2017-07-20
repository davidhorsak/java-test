package test.java.de.fidor;

import main.java.de.fidor.NMUTPrinter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NMUTPrinterTest {
    public NMUTPrinter printer;

    @Before
    public void setUp() {
        printer = new NMUTPrinter("argument");

    }

    @Test
    public void itReturnString() {
        assertEquals(printer.it(), "works!");
    }
}
