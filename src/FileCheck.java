import java.io.File;
import java.io.IOException;

public class FileCheck{
    public static void main(String[] args) throws IOException {
        File file=new File("testFile.txt");// just created the object of File but not actual file
        System.out.println(file.exists());
        
        file.createNewFile();//actual file is being created.
        System.out.println(file.exists());
    }
}
