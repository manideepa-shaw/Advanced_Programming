import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class Q4 
{
    public static void main(String[] args) {
        System.out.print("Enter filename : ");
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        FileWriter f2;
        FileReader f3;
        try
        {
            f3 = new FileReader(fname);
            Scanner sf = new Scanner(f3);
            while(sf.hasNextLine())
            {
                System.out.println(sf.nextLine());
            }
            f3.close();
        }
        // file not present
        catch(Exception e)
        {
            File f = new File(fname);
            try{
                if(f.createNewFile())
                {
                    System.out.println("File Created. Now enter words");
                    String w;
                    f2 = new FileWriter(fname);
                    do
                    {
                        w=sc.nextLine();
                        f2.write(w+" ");
                    }while(!w.toLowerCase().equals("stop"));
                    f2.close();
                }
            }
            catch(Exception d)
            {
                System.out.println("Error Occured!!");
            }
        }
        
    }
}
