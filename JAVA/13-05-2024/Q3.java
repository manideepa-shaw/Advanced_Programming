// WAP that takes a filename from user and checks whether it existes or not. If exists then check whether it is a directory or not . If it is a directory then show the list of files in it. If it is not a directory then show whether it can be read and/ or written into.
import java.io.File;
import java.util.*;
class Q3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename : ");
        String f = sc.nextLine();
        File fname = new File(f);
        if(fname.exists())
        {
            if(fname.isDirectory())
            {
                System.out.println("The files in the directory : ");
                String[] filenames = fname.list();
                for(String i:filenames)
                {
                    File checkFile = new File(i);
                    if(!checkFile.isDirectory())
                        System.out.println(i);
                }
            }
            else
            {
                if(fname.canRead())
                {
                    System.out.println("The file can be read.");
                }
                else
                {
                    System.out.println("The file can not be read.");
                }


                if(fname.canWrite())
                {
                    System.out.println("The file can be written.");
                }
                else
                {
                    System.out.println("The file can not be written.");
                }
            }
        }
        else
        {
            System.out.println("Not found!!");
        }
        sc.close();
    }
}