import java.util.*;
class Instructor {
    String name;
    long phone;
    void setInstructor(String name, long phone)
    {
        this.name = name;
        this.phone = phone;
    }
    void viewInstructor()
    {
        System.out.println("Instructor name : "+name);
        System.out.println("Phone Number : "+phone);
        System.out.println("_________________________________________________");
    }
}
class TextBook {
    String title,author,publisher;
    void setTextBook(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    void viewTextBook()
    {
        System.out.println("Book Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Publisher : "+publisher);
        System.out.println("_________________________________________________");
    }
}
class Course {
    String course;
    Instructor i;
    TextBook t;
    void setCourse(String course, Instructor i, TextBook t)
    {
        this.course= course;
        this.i = i;
        this.t = t;
    }
    void viewCourse()
    {
        System.out.println("Course : "+course);
        i.viewInstructor();
        t.viewTextBook();
        System.out.println("_________________________________________________");
    }
}
public class Eleven {
public static void main(String[] args) {
    Instructor i1 = new Instructor();
    i1.setInstructor("Smith Jones",9883222741L);
    Instructor i2 = new Instructor();
    i2.setInstructor("Raj Verma", 8910694874L);
    TextBook t1= new TextBook();
    TextBook t2= new TextBook();
    t1.setTextBook("Lets C", "Schilz", "ABC Publisher");
    t2.setTextBook("Hello World!", "Henry Buuy", "XYZ Pub");
    Course cou = new Course();
    cou.setCourse("C Programming",i2, t1);
    cou.viewCourse();
}
}
