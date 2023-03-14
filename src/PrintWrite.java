import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWrite {
    public static void main(String[] args) throws IOException{
        //The main advantage of PrintWriter is that "We can write any primitive data type using it"
        FileWriter fw=new FileWriter("print.txt");
        PrintWriter pw=new PrintWriter(fw);
        pw.write(100);
        pw.println(100); //write method will write 'd' in file while println write integer i.e.100 only
        pw.println("Hey,PrintWriter here");
        pw.println("I am most enhanced writer in file");
        pw.flush();
        pw.close();

    }
}
