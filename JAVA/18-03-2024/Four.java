import java.util.*;
public class Four
{
    public static void main(String[] args) {
        final double pi=3.14;
        double r,area;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius : ");
        r=sc.nextDouble();
        area=r*r*pi;
        System.out.println("Area of circle is : "+area);
    }
}