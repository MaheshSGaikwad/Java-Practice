import java.io.File;
import java.io.IOException;

public class FileWithDir {
    public static void main(String[] args) throws IOException {
      //1.Create a file in current directory
        File file1=new File("abcCurrent.txt");
        file1.createNewFile();
        System.out.println(file1.exists());

     //2.Create a file in specific directory
       File f=new File("specificDemo");
       f.mkdir();
       File file2=new File("specificDemo","abcSpecific.txt");
       file2.createNewFile();

     //3.Create a file in referenced directory
       File file3=new File(f,"abcReference.txt");
       file3.createNewFile();
    }
}
