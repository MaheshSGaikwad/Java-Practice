import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteExample2 {
    //write a java program to exclude the contact from 1st file which is present in 2nd file.need to create 3rd file
    public static void main(String[]args) throws IOException{
        BufferedReader br1=new BufferedReader(new FileReader("AllContactInfo"));
        PrintWriter pw=new PrintWriter("RequiredContactInfo.txt");
        String line= br1.readLine();
        BufferedReader br2=new BufferedReader(new FileReader("DeleteContactInfo.txt"));
        String target= br2.readLine();
        while (target!=null){
            if (line.equals(target))
                break;
            target= br2.readLine();
            pw.println(line);
            line=br1.readLine();
        }
        pw.flush();
        pw.close();
    }
}
