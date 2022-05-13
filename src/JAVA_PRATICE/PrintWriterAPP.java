package JAVA_PRATICE;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterAPP {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p1 = new PrintWriter("result.txt");
        p1.write("hello world");
        p1.close();
        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("hello java");
        p2.close();

    }
}
