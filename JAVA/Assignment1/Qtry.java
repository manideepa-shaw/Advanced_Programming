
import java.util.Scanner;

public class Qtry 
{
    int x;
    Qtry()
    {
        this.x=0;
    }
    Qtry(int x)
    {
        this.x=x;
    }
    void p()
    {
        System.out.println(this.x);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Qtry h=new Qtry(5);
        h.p();
        // System.out.println(h.x);
    }

}

