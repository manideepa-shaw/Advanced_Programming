import java.util.*;
class Q6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");    
        int x = sc.nextInt();
        sc.nextLine();
        System.out.print("After making "+x+" as object : ");
        Integer i=x;
        System.out.println(i);
        System.out.print("After making "+i+" as basic type : ");
        x=i; //unboxing
        System.out.println(x);

        System.out.println("Enter a string: ");    
        String s = sc.nextLine();
        System.out.print("After making "+s+" as object : ");
        String so=s;
        System.out.println(so);
        System.out.print("After making "+so+" as basic type : ");
        s=so; //unboxing
        System.out.println(s);


        System.out.println("Enter a string(only numbers): ");    
        String s1 = sc.nextLine();
        System.out.print("After making "+s1+" as numeric object : ");
        int sno=Integer.parseInt(s1);
        System.out.println(sno);
        System.out.print("After making "+sno+" as string basic type : ");
        s=String.valueOf(sno); //unboxing
        System.out.println(s);
    }
}