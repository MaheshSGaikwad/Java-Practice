import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriter {
    public static void main(String[] args) throws IOException{
        FileWriter f=new FileWriter("abc.txt");
        f.write(100);
        f.write("\n");
        f.write("Mahesh");
        f.write(" Gaikwad");
        f.flush();
        f.close();
    }
}
