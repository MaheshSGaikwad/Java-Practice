import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException{
        File f=new File("abc.txt");
        System.out.println(f.exists());
        //override the existing data
        FileWriter fw=new FileWriter("abc.txt");
        fw.write("Welcome to FileWriter");
        fw.flush();
        fw.close();
        //append the data without override
        FileWriter fw1=new FileWriter("abc.txt",true);
        fw1.write(" \n I am creating my space here not replacing you");
        fw1.flush();
        fw1.close();

        //Read the File
        FileReader fr=new FileReader("abc.txt");
        //1.read the character one by one----always return the unicode value so need to parse
        int readChar=fr.read();
        while (readChar!=-1){
            System.out.println((char)readChar);
            readChar= fr.read();
        }
       //2.read array of char------
        System.out.println("*************************************************");
        FileReader fileReader=new FileReader("abc.txt");
       char[] ch=new char[(int)f.length()];
        fileReader.read(ch);
        for(char ch1:ch){
            System.out.println(ch1);
        }
        fr.close();
 }
}
