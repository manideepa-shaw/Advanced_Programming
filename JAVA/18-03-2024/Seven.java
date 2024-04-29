// Student class with roll, name and score as atributes. Methods to set attributes. Display the attributes.
// Copy them by passing the object as parameter

import java.util.Scanner;

public class Seven {
    int roll,score;
    String name;
    Seven()
    {
        roll=score=0;
        name="";
    }
    Seven(Seven o)
    {
        this.name=o.name;
        this.roll=o.roll;
        this.score=o.score;
    }
    void set()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll : ");
        roll=sc.nextInt();
        System.out.print("Name: ");
        name=sc.next();
        System.out.print("Score : ");
        score=sc.nextInt();
    }
    void display()
    {
        System.out.print("Roll : "+roll+"\nName : "+name+"\nScore : "+score);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Seven obj = new Seven();
        obj.set();
        System.out.println("\nActual data\n________________");
        obj.display();
        Seven copy = new Seven(obj);
        System.out.println("\nNow copying this object in another\n_____________________________________________________");
        copy.display();
    }
}
