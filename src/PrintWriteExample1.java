import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteExample1 {
    //write a program to merge the two files into 3rd file.
    public static void main(String[] args) throws IOException{
        BufferedReader br1=new BufferedReader(new FileReader("abc.txt"));
        PrintWriter pw=new PrintWriter("merge.txt");
        String line=br1.readLine();
        while(line!=null){
            pw.println(line);
            line=br1.readLine();
        }
        br1=new BufferedReader(new FileReader("print.txt"));
        line= br1.readLine();
        while (line!=null){
            pw.println(line);
            line= br1.readLine();
        }
        pw.flush();
        pw.close();
    }
}
