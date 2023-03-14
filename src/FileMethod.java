import java.io.File;
import java.io.IOException;

public class FileMethod {
    public static void main(String [] args) throws IOException {
    //1.String [] list method
        File file=new File("C:\\Users\\Admin\\Desktop\\FileIO");
        int count=0;
        String [] list=file.list();
        System.out.println("All the directory & files are:");
        for (String s:list){
            count++;
            System.out.println(s);
        }
        System.out.println("The total files & directory present in this directory:" +count);
        count=0;

        // for seperate file or directory
        System.out.println("All the files are:");
        for (String s:list){
            File f=new File(file,s);
            if (f.isFile())      //if(f.isDirectory())
            {
                count++;
                System.out.println(s);
            }
        }
        System.out.println("The totals files are:"+count);

    //2.isFile(),isDirectory()
       File file1=new File("src");
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());

    //3.long length
       File file2=new File("testFile.txt");
        System.out.println("Number of character in file:"+file2.length());

    //4.delete
      File file3=new File("delete.txt");
      file3.createNewFile();
        System.out.println(file3.delete());
    }
}
