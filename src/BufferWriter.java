import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[]args) throws IOException{
        //In order to use BufferedWriter we need FileWrite
        FileWriter fileWriter=new FileWriter("xyz.com");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        //BufferedWrite solve the problem of line seperator by newLine() method
        bufferedWriter.write(1000);
        bufferedWriter.newLine();
        bufferedWriter.write("Welcome to Buffer Writer");
        bufferedWriter.newLine();
        bufferedWriter.write("Buffer Writer solve the problem of line seperator");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
