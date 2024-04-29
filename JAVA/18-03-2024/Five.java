// package JAVA.18-03-2024;
// accept a string and assign it to another. Check comparision with == and equals().
// Take two Strings and put same input for them.Repeat the equality checking

import java.util.Scanner;

public class Five {
    static void check(String str1, String str2)
    {
        System.out.print("Checking using ==  ");
        System.out.println(str2==str1);
        System.out.print("Checking using equals()  ");
        System.out.println(str1.equals(str2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.print("Enter string 1 : ");
        s1=sc.nextLine();
        s2=s1;
        check(s1,s2);
        System.out.print("________________________________________________________\nEnter string 1 : ");
        s1=sc.nextLine();
        System.out.print("Enter string 2 : ");
        s2=sc.nextLine();
        check(s1, s2);
    }
}
