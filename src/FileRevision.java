import java.io.File;
import java.io.IOException;

public class FileRevision {
    public static void main(String[] args) throws IOException {
        //create a file at current location
        File f=new File("filerevision.txt");
        if (f.exists())
        {
            f.createNewFile();
        }
        //create a file at specified location
        //Step 1: create a directory
        File f1=new File("revision");
        f1.mkdir();
        //Step 2:create a file
        File f2=new File(f1,"xyz.txt");
        f2.createNewFile();
        System.out.println(f2.exists());
        // methods in File
        System.out.println("1:isFile ");
        System.out.println(f1.isFile());
        System.out.println("2.isDirectory");
        System.out.println(f1.isDirectory());
        System.out.println("3.length method");
        System.out.println(f1.length());
        System.out.println("List Method");
        String[] list=f.list();
        System.out.println("4.Delete method");
        File fDelete=new File("delete.txt");
        fDelete.createNewFile();
        System.out.println(fDelete.exists());
       // fDelete.delete();
       // System.out.println(fDelete.exists());
    }

}
