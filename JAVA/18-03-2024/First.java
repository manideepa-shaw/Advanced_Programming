// package JAVA.18-03-2024;
// accept two short integers from user and display the sum
import java.util.*;
public class First {
    public static void main(String[] args) {
        short x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x : ");
        x=sc.nextShort();
        System.out.print("Enter y : ");
        y=sc.nextShort();
        System.out.println("x + y : "+(x+y));
    }
}
