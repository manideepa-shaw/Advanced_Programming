import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
class Student
{
    int roll, score;
    String name;
    Student(){};
    Student(int roll, String name, int score)
    {
        this.roll=roll; this.name=name; this.score=score;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter filename : ");
        String fname = sc.nextLine();
        try
        {
            FileReader f=new FileReader(fname);
            Scanner sf = new Scanner(f);
            while(sf.hasNextLine())
            {
                System.out.println(sf.nextLine());
            }
            f.close();
        }
        catch(Exception e)
        {
            System.out.println("File doesnot exists.");
            File f1 = new File(fname);
            try
            {
                if(f1.createNewFile())
                {
                    FileWriter f = new FileWriter(fname);
                    System.out.println("New File Created. Now add data to the file.\nEnter -999 as roll to stop!");
                    while(true)
                    {
                        System.out.print("Enter Roll No. : ");
                        int roll = sc.nextInt();    sc.nextLine();
                        if(roll==-999)  break;
                        System.out.print("Enter Name : ");
                        String name = sc.nextLine();
                        System.out.print("Enter Score: ");
                        int score = sc.nextInt();   sc.nextLine();
                        Student s1 = new Student(roll,name,score);
                        f.write(s1.roll+" "+s1.name+" "+s1.score+"\n");
                    }
                    f.close();
                }
            }
            catch(Exception h)
            {
                System.out.println("Error Occured");
            }
        }
    }
}
