package ZapisDoPliku;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo  {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("danie.txt");

        pw.println("Oliwier lubi pizzę :)");

        //zapisanie kolejnej linii
        pw.println("Szymon lubi jeść (dużo kebaba!)");

        pw.close();
    }
}
