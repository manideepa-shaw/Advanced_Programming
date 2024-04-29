import java.util.*;
public class Eight 
{
    int roll,score;
    String name;
    Eight(){ 
     }
    Eight(int roll)
    {
        this.roll=roll;
    }
    Eight(int roll, String name)
    {
        this.roll=roll;
        this.name = name;
    }
    Eight(int roll, String name, int score)
    {
        this.roll=roll;
        this.name = name;
        this.score = score;
    }
    // Eight(Eight s)
    // {

    // }
    void display()
    {
        System.out.println("Name : "+name+"\nRoll : "+roll+"\nScore : "+score);
        System.out.println("______________________________________________");
    }
    public static void main(String[] args) 
    {
        Eight s1 = new Eight();
        Eight s2 = new Eight(1);
        Eight s3 = new Eight(2,"Manideepa");
        Eight s4 = new Eight(3,"Peeyush",98);
        Eight copyEight = s4; //copy constructor
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        // copy 
        copyEight.display();
    }
}
