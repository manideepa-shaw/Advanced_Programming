import java.util.*;
class Address{
    int pm,pin;
    String street,city,state;
    Address(){}
    Address(int pm,String street, String city, String state, int pin)
    {
        this.pm=pm; this.street=street; this.city=city; this.state=state;   this.pin=pin;
    }
    void displayaddress()
    {
        System.out.print(pm+", "+street+" "+city+" "+state+" "+pin+"\n");
    }
}
class Person
{
    protected String name,email;
    protected long phone;
    Address a;
    Scanner sc = new Scanner(System.in);
    Person(){}
    Person(String name, String email, long phone, Address a)
    {
       this.name=name;  this.email=email;   this.phone=phone; this.a=a;

    }
    void display()
    {
        System.out.print("Name : "+name+"\nEmail : "+this.email+"\nPhone : "+phone+"\nAddress : ");
        a.displayaddress();
        System.out.println("__________________________________________________________");
    }
    void change(int pm)
    {
        a.pm=pm;
    }
    void change(String street, String city)
    {
        a.street = street;   a.city=city;
    }
    void change(String state, int pin)
    {
        a.state=state;   a.pin=pin;
    }
}
class Student extends Person
{
    int roll;
    String course;
    Student(String name,String email, long phone, int roll, String course, Address a)
    {
       super(name,email,phone,a);
       this.roll=roll;
       this.course=course;
    }
    void display()
    {
        System.out.print("Name : "+name+"\nRoll : "+roll+"\nCourse : "+course+"\nEmail : "+email+"\nPhone : "+phone+"\nAddress : ");
        a.displayaddress();
    }
}
class Faculty extends Person
{
    int eid;
    String department,spec;
    Faculty(String name,String email, long phone, int eid, String department, String spec,Address a)
    {
       super(name,email,phone,a);
       this.department=department;
       this.spec=spec;
    }
    void display()
    {
        System.out.print("Name : "+name+"\nEmployee ID : "+eid+"\nDepartment : "+department+"\nSpecilization : "+spec +"\nEmail : "+email+"\nPhone : "+phone+"\nAddress : ");
        a.displayaddress();
        System.out.println("__________________________________________________________");
    }
}
public class Q2 {

    public static void main(String[] args) {
        String name,email,course;
        long phone;
        int roll,choice;
        int pm,pin;String street,city,state,spec;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter details of a Student\n----------------------------------------\n");
        System.out.print("Name : ");
        name=sc.nextLine();
        System.out.print("Email : ");
        email=sc.nextLine();
        System.out.print("Phone : ");
        phone=sc.nextLong();
        System.out.print("Roll : ");
        roll=sc.nextInt();
        System.out.print("Course : ");
        sc.nextLine();
        course=sc.nextLine();

        System.out.print("Enter premises no. : ");
        pm=sc.nextInt();
        sc.nextLine();
        System.out.print("Street : ");
        street=sc.nextLine();
        System.out.print("City : ");
        city=sc.nextLine();
        System.out.print("Pin Code : ");
        pin=sc.nextInt();
        sc.nextLine();
        System.out.print("State : ");
        state = sc.nextLine();
        Address a = new Address(pm,street,city,state,pin);

        Student s1 = new Student(name, email, phone, roll, course,a);
        s1.display();
        System.out.println("1.Change premises no.\n2.Change Street and City\n3.Change State and pincode\n4.Don't change : ");
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1: System.out.print("Enter premises number : ");
            pm=sc.nextInt(); sc.nextLine();
            s1.change(pm);
            break;
            case 2: System.out.print("Enter Street : ");
            street= sc.nextLine();
            System.out.print("Enter City : ");
            city=sc.nextLine();
            s1.change(street,city);
            break;
            case 3:
            System.out.print("Enter State: ");
            state= sc.nextLine();
            System.out.print("Enter PinCode : ");
            pin=sc.nextInt() ;sc.nextLine();
            s1.change(state, pin);
            break;
            default :    break;
        }

        s1.display();



        System.out.print("Enter details of a Faculty\n----------------------------------------\n");
        System.out.print("Name : ");
        name=sc.nextLine();
        System.out.print("Email : ");
        email=sc.nextLine();
        System.out.print("Phone : ");
        phone=sc.nextLong();
        System.out.print("Eid : ");
        roll=sc.nextInt();
        System.out.print("Department : ");
        sc.nextLine();
        course=sc.nextLine();
        System.out.print("Speciliazation : ");
        spec=sc.nextLine();

        System.out.print("Enter premises no. : ");
        pm=sc.nextInt();
        sc.nextLine();
        System.out.print("Street : ");
        street=sc.nextLine();
        System.out.print("City : ");
        city=sc.nextLine();
        System.out.print("Pin Code : ");
        pin=sc.nextInt();
        sc.nextLine();
        System.out.print("State : ");
        state = sc.nextLine();
        Address a2 = new Address(pm,street,city,state,pin);

        Faculty f1 = new Faculty(name, email, phone, roll, course,spec,a2);
        f1.display();

    }
}
